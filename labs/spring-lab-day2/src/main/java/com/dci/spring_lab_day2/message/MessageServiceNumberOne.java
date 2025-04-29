package com.dci.spring_lab_day2.message;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MessageServiceNumberOne implements MessageService {
    @Override
    public String getMessage() {
        return "Message Created By MessageService Number 1";
    }
}
