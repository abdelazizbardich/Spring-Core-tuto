package ma.youcode.beans;


import ma.youcode.Dao.UserDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public  class User {

    @Autowired
    @Qualifier("UserDao1")
    private UserDaoInterface userDao;


    public User(UserDaoInterface userDao) {
        this.userDao = userDao;
    }
    public User() {
        this.userDao = userDao;
    }

    public UserDaoInterface getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoInterface userDao) {
        this.userDao = userDao;
    }
}
