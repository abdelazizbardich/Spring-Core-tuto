package ma.youcode.Dao;

import org.springframework.stereotype.Repository;

@Repository("UserDao2")
public class UserDao2 implements UserDaoInterface{

    @Override
    public String satHi() {
        return "Hi from User Dao 2";
    }
}
