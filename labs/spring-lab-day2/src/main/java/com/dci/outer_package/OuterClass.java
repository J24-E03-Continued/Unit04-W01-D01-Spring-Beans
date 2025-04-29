package com.dci.outer_package;


import org.springframework.stereotype.Component;

@Component
public class OuterClass {
    public  OuterClass() {
        System.out.println("OuterClass Constructor");
    }
}
