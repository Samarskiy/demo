package testApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import testApplication.client.login.LoginViewImpl;
import testApplication.shared.User;

import java.util.List;
import java.util.logging.Logger;

public class ProjectEntryPoint implements EntryPoint {

//    private final AuthServiceAsync authService = GWT.create(AuthService.class);
    private static Logger consoleLog = Logger.getLogger(ProjectEntryPoint.class.getName());

    @Override
    public void onModuleLoad() {
        /*SimplePanel panel = new SimplePanel();
        panel.setStyleName("simplePanel");
        Label textBox = new Label();
        Date date = new Date();
        DateTimeFormat dtf = DateTimeFormat.getFormat("HH");
        String currentHourString = dtf.format(date, TimeZone.createTimeZone(-60));
        int currentHourInt = Integer.parseInt(currentHourString);
        consoleLog.addHandler(new ConsoleLogHandler());
        consoleLog.severe(currentHourString);
        if (currentHourInt >= 6 || currentHourInt <= 9) {
            textBox.setText("Добрый вечер, Иван.");
        } else {
            textBox.setText("Доброе утро, Иван.");
        }
        textBox.setStyleName("textBox");
        panel.add(textBox);
        RootPanel.get().add(panel);
        authService.retrieveUsername(new AsyncCallback<String>() {
            public void onFailure(Throwable caught) {
                Window.alert("Remote Procedure Call - Failure");
            }

            public void onSuccess(String result) {
                Window.alert(result);
            }
        });*/

        final LoginViewImpl loginView = new LoginViewImpl();

        AuthServiceAsync authService = GWT.create(AuthService.class);

        authService.getAllUsers(new AsyncCallback<List<User>>() {
            @Override
            public void onFailure(Throwable caught) {
                Window.alert("Fail getAllUsers"); }
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
