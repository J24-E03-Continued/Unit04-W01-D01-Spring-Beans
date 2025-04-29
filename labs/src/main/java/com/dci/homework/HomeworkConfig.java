package com.dci.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HomeworkConfig {

    @Bean
    public String displaySingletonBean() {
        return "This is a singleton bean!";
    }

    @Bean
    @Scope("prototype")
    public String displayPrototypeBean() {
        return "This is a prototype bean!";
    }
}
