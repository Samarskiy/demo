package testApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import testApplication.client.login.LoginViewImpl;
import testApplication.shared.User;

import java.util.List;

public class ProjectEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {

        final LoginViewImpl loginView = new LoginViewImpl();

        AuthServiceAsync authService = GWT.create(AuthService.class);
        authService.getAllUsers(new AsyncCallback<List<User>>() {
            @Override
            public void onFailure(Throwable caught) {
                Window.alert("Fail getAllUsers");
            }

            @Override
            public void onSuccess(List<User> result) {
                User user = result.get(0);
                loginView.getUserInputBox().setText(user.getUsername());
                loginView.getPassInputBox().setText(user.getPassword());
                loginView.getCompletionLabel1().setText("Users in data base: " + result.size());
                RootPanel.get().add(loginView);
            }
        });
        RootPanel.get().add(loginView);
    }

}
