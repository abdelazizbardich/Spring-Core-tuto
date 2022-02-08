import ma.youcode.beans.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml")); // deprecated
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml"); // recomended
        User user = beanFactory.getBean("user",User.class);
        user.SayHello("john");
    }
}
