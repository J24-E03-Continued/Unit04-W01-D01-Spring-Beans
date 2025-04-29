package com.example.demo;

public class SingletonBean {

    public SingletonBean() {
        System.out.println("SingletonBean instantiated");
    }

    public String getInfo() {
        return "I am a singleton bean with ID: " + System.identityHashCode(this);
    }
}