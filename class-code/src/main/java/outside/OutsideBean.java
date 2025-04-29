package outside;

import org.springframework.stereotype.Component;

@Component
public class OutsideBean {

    public OutsideBean(){
        System.out.println("Outside Bean " + this );
    }
}
