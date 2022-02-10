package ma.youcode.beans;

import ma.youcode.dao.UserDao;

public class User {

    private UserDao userDao;

    public User(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sayHi(){
        System.out.println(this.userDao.sayHi());
    }
}
