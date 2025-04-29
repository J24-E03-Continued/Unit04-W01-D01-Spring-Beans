package com.dci.intro;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean(){
        System.out.println("Singleton Bean" + this);
    }
}
