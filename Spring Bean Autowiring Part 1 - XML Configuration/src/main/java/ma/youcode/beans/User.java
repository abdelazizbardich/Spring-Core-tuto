package ma.youcode.beans;

import ma.youcode.Dao.UserDao;

public class User {

    private UserDao userDao;

    public User() {
        System.out.println("default constructor.....");
    }

    public User(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("setter....");
        this.userDao = userDao;
    }
}
