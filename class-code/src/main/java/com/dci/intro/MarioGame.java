package com.dci.intro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mario")
public class MarioGame implements Game {

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Crouch");
    }

    public void left(){
        System.out.println("Go Left");
    }

    public void right(){
        System.out.println("Go Right");
    }
}
