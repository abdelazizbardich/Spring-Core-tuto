package ma.youcode.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ma.youcode.beans","ma.youcode.Dao"})
public class AppConfig {
}
