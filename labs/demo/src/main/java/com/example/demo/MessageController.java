package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService defaultService;
    private final MessageService alternativeService;
    private final com.example.demo.CustomComponent customComponent;

    @Autowired
    public MessageController(
            MessageService defaultService,
            @Qualifier("alternativeService") MessageService alternativeService,
            com.example.demo.CustomComponent customComponent) {
        this.defaultService = defaultService;
        this.alternativeService = alternativeService;
        this.customComponent = customComponent;
        System.out.println("MessageController instantiated with injected services");
    }

    @GetMapping("/message")
    public String getMessage() {
        return "<h1>Hello from Spring!</h1>" +
                "<p>Default service says: " + defaultService.getMessage() + "</p>" +
                "<p>Alternative service says: " + alternativeService.getMessage() + "</p>" +
                "<p>" + customComponent.getInfo() + "</p>";
    }
}