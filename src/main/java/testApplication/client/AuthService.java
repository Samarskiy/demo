package testApplication.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import testApplication.shared.User;

import java.util.List;

@RemoteServiceRelativePath("testApplicationService")
public interface AuthService extends RemoteService {
    List<User> getAllUsers();

    User authorizedUser(String login, String password);
}
