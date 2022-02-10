package ma.youcode.Dao;

import org.springframework.stereotype.Repository;

@Repository("UserDao1")
public class UserDao1 implements UserDaoInterface{
    @Override
    public String satHi() {
        return "Hi from User Dao 1";
    }
}
