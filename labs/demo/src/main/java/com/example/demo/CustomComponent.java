package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CustomComponent {

    public CustomComponent() {
        System.out.println("CustomComponent from separate package instantiated");
    }

    public String getInfo() {
        return "I am from a custom-scanned package";
    }
}
