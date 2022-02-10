package ma.youcode.config;

import ma.youcode.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan({"ma.youcode.beans"}) // use this to automatically define beans (note: you have to add @Component to all beans in the package)
public class AppConfig {

    // No need to create this if you use @ComponentScan annotation
    @Bean(initMethod = "initUser")
    public User user(){
        return new User();
    }
}
