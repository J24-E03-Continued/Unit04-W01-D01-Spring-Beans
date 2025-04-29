package com.example.demo;

public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("PrototypeBean instantiated");
    }

    public String getInfo() {
        return "I am a prototype bean with ID: " + System.identityHashCode(this);
    }
}

