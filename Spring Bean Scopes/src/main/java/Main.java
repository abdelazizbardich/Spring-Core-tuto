import ma.youcode.beans.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("=========================================================");
        System.out.println("===================================== Different signature");
        User Puser1 = beanFactory.getBean("Puser",User.class);
        User Puser2 = beanFactory.getBean("Puser",User.class);
        System.out.println(Puser1);
        System.out.println(Puser2);
        System.out.println("=========================================================");
        System.out.println("=====================================  Same signature");
        User Suser1 = beanFactory.getBean("Suser",User.class);
        User Suser2 = beanFactory.getBean("Suser",User.class);
        System.out.println(Suser1);
        System.out.println(Suser2);
    }
}
