package ma.youcode.beans;



import ma.youcode.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User {

//    @Autowired // Property based autowire injection (Not recommend)
    private UserDao userDao;

//    @Autowired // Constructor based autowire injection (Recommended) / Note: in constructor based autowire it's not necessary to use annotation (@Autowired) this works if you don't have a default constructor
    public User(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
//    @Autowired // Setter based autowire injection
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
