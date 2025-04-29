package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DefaultMessageService implements MessageService {

    public DefaultMessageService() {
        System.out.println("DefaultMessageService (Primary) instantiated");
    }

    @Override
    public String getMessage() {
        return "Default message from primary service";
    }
}