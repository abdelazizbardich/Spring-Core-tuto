package ma.youcode.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class User implements BeanNameAware , BeanFactoryAware, ApplicationContextAware {

    public String fname;

    public User(){
        // runs when no constructor-arg given from spring.xml
        System.out.println("User non-arg constructor...");
    }
    public User(String fname){
        // runs when constructor-arg are given from spring.xml
        this.fname = fname;
        System.out.println("User fname constructor... "+this.fname);
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        // runs when property are given from spring.xml
        this.fname = fname;
        System.out.println("User fname setter... "+this.fname);
    }


    // implementation of BeanNameAware
    @Override
    public void setBeanName(String s) {
        // You can access bean name here
        System.out.println("setBeanName.... "+s);
    }

    // implementation of BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // You can access bean Factory here
        System.out.println("setBeanFactory... "+beanFactory.isPrototype("user"));
    }

    // implementation of ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // You can access application context here
        System.out.println("setApplicationContext... "+applicationContext.isSingleton("user"));

    }
}
