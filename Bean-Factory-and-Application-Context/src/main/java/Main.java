import ma.youcode.beans.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml")); // deprecated
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml"); // recommended
        BeanFactory beanFactory = new FileSystemXmlApplicationContext("src/main/resources/spring.xml"); // to give a custom xml file location
        User user = beanFactory.getBean("user",User.class);
        user.SayHello("john");
    }
}
