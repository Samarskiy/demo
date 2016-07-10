package testApplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import testApplication.shared.User;

import java.util.List;

public interface AuthServiceAsync {
    void getAllUsers(AsyncCallback<List<User>> async);

    void authorizedUser(String login, String password, AsyncCallback<User> async);

}
