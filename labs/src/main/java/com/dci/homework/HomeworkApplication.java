package com.dci.homework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dci.homework", "com.example.customscan"})
public class HomeworkApplication implements CommandLineRunner {

    private final MessageRunner messageRunner;

    private HomeworkApplication(MessageRunner messageRunner) {
        this.messageRunner = messageRunner;
    }

    public static void main(String[] args) {
        var context = SpringApplication.run(HomeworkApplication.class, args);

        String[] allBeans = context.getBeanDefinitionNames();
        for (String beanName : allBeans) {
            Object bean = context.getBean(beanName);
            String className = bean.getClass().getName();

            if (className.startsWith("com.dci.homework") || bean instanceof String || className.startsWith("com.example.customscan")) {
                System.out.println(beanName + " -> " + bean);
            }
        }

    }

    @Override
    public void run(String... args) throws Exception {
        messageRunner.displayMessage();
    }

    private interface MessageService {
        String getMessage();
    }

    @Component
    @Primary
    @Qualifier("text")
    private record TextMessage() implements MessageService {
        @Override
        public String getMessage() {
            return "Displaying the text message...";
        }
    }

    @Component
    @Qualifier("voice")
    private record VoiceMessage() implements MessageService {
        @Override
        public String getMessage() {
            return "Playing the voice message...";
        }
    }

    @Component
    private record MessageRunner(@Qualifier("voice") MessageService messageService) {
        private void displayMessage() {
            System.out.println(messageService.getMessage());
        }
    }

    @RestController
    private record MessageController() implements MessageService {
        @GetMapping("/message")
        @Override
        public String getMessage() {
            return "<h1>Hello from Spring!</h1>";
        }
    }
}
