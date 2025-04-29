package com.dci.spring_lab_day2.message;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessageService messageService;

    public MessageController(@Qualifier("messageServiceNumberTwo") MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String showMessage() {
        return "<h1>" + messageService.getMessage() + "</h1>";
    }
}
