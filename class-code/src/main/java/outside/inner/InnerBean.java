package outside.inner;

import org.springframework.stereotype.Component;

@Component
public class InnerBean {
    public InnerBean(){
        System.out.println("Inner Bean " + this);
    }
}
