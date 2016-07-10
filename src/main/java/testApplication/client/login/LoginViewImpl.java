package testApplication.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import testApplication.client.AuthService;
import testApplication.client.AuthServiceAsync;
import testApplication.shared.User;

import java.util.logging.Logger;

public class LoginViewImpl extends Composite implements LoginView {
    private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);
    AuthServiceAsync authService = com.google.gwt.core.shared.GWT.create(AuthService.class);
    public static final Logger logger = Logger.getLogger(LoginViewImpl.class.getName());

    @UiTemplate("LoginViewImpl.ui.xml")
    interface LoginUiBinder extends UiBinder<Widget, LoginViewImpl> {
    }

    @UiField(provided = true)
    final LoginResources res;

    public LoginViewImpl() {
        this.res = GWT.create(LoginResources.class);
        res.style().ensureInjected();
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiField
    TextBox loginBox;
    @UiField
    TextBox passwordBox;
    @UiField
    Label completionLabel1;
    @UiField
    Label completionLabel2;
    @UiField
    Button buttonSubmit;

    private Boolean tooShort = false;

    @UiHandler("buttonSubmit")
    void doClickSubmit(ClickEvent event) {
        if (tooShort) {
            Window.alert("LoginViewImpl or Password is too short!");
        } else {
            Window.alert("Submit!");
            authService.authorizedUser(loginBox.getText(), passwordBox.getText(), new AsyncCallback<User>() {
                @Override
                public void onFailure(Throwable throwable) {
                    logger.info(throwable.toString());
                    Window.alert("Something wrong with authorization...");
                }

                @Override
                public void onSuccess(User user) {
                    initialGreeting(user);
                }
            });
        }
    }

    @UiHandler("loginBox")
    void handleLoginChange(ValueChangeEvent<String> event) {
        if (event.getValue().length() < 2) {
            completionLabel1.setText("LoginViewImpl too short (Size must be > 2)");
            tooShort = true;
        } else {
            tooShort = false;
            completionLabel1.setText("");
        }
    }
    @UiHandler("loginBox" )
    void handleLoginKeyboardKey(KeyDownEvent event) {
        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
            Window.alert("Sumbit by Enter!");
        }
    }
    @UiHandler("passwordBox" )
    void handlePasswordKeyboardKey(KeyDownEvent event) {
        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
            Window.alert("Sumbit by Enter!");
        }
    }

    @UiHandler("passwordBox")
    void handlePasswordChange(ValueChangeEvent<String> event) {
        if (event.getValue().length() < 2) {
            tooShort = true;
            completionLabel2.setText("Password too short (Size must be > 2)");
        } else {
            tooShort = false;
            completionLabel2.setText("");
        }
    }

    private  void initialGreeting (User user){
        if (user != null){
            RootPanel.get().clear();
            RootPanel.get().add(new GreetingPage(user.getUsername()));
        } else Window.alert("User not found");
    }

    @Override
    public HasText getUserInputBox() {
        return loginBox;
    }

    @Override
    public HasText getPassInputBox() {
        return passwordBox;
    }

    public Label getCompletionLabel1() {
        return completionLabel1;
    }
}
