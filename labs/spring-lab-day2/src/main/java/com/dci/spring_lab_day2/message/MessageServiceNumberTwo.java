package com.dci.spring_lab_day2.message;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceNumberTwo implements MessageService {
    @Override
    public String getMessage() {
        return "Message Created By MessageService Number 2";
    }
}
