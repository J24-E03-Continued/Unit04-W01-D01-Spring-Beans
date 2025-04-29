package com.example.demo;


import org.springframework.stereotype.Component;

@Component("alternativeService")
public class AlternativeMessageService implements com.example.demo.MessageService {

    public AlternativeMessageService() {
        System.out.println("AlternativeMessageService instantiated");
    }

    @Override
    public String getMessage() {
        return "Alternative message from secondary service";
    }
}