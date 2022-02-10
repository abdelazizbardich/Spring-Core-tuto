package ma.youcode.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;
@Component
//if the bean scope is prototype, the Destory isn't being called.
//@Scope("prototype")
public class User implements DisposableBean {

    public User() {
        System.out.println("Bean Construct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean destroy called!");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("Custom Destroy Bean called!");
    }
}
