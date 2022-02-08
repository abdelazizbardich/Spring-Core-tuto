import ma.youcode.beans.User;
import ma.youcode.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = beanFactory.getBean("user", User.class);
        user.SayHello("john");
    }
}
