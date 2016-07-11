package testApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import testApplication.client.AuthService;
import testApplication.shared.User;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AuthServiceImpl extends RemoteServiceServlet implements
        AuthService {
    private SessionFactory sessionFactory;
    private Session session;
    private List usersList = new ArrayList<>();

    public static final Logger logger = Logger.getLogger(AuthServiceImpl.class.getName());

    public AuthServiceImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    @Override
    public List<User> getAllUsers() {
        Query query = session.createQuery("from User");
        usersList = query.list();
        return usersList;
    }

    @Override
    public User authorizedUser(String login, String password) {
        List<User> result = getAllUsers();
        logger.info("Comparing the login and password");
        for (User user : result) {
            if (login.equals(user.getUsername()) && hashPasswordAndSault(password).equals(user.getPassword())) {
                logger.info("User find....");
                return user;
            }
        }
        return null;
    }

    public String hashPasswordAndSault(String name) {
        name += "sault";
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(name.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while (md5Hex.length() < 32) {
            md5Hex = "0" + md5Hex;
        }

        return md5Hex;
    }
}