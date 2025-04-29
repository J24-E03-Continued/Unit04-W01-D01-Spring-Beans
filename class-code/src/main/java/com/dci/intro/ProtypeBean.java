package com.dci.intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProtypeBean {
    public ProtypeBean(){
        System.out.println("prototype bean " + this);
    }
}
