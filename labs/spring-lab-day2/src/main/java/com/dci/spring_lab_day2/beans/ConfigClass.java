package com.dci.spring_lab_day2.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {

    @Bean
    public SingletonBean singletonString() {
        return new SingletonBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeString() {
        return new PrototypeBean();
    }
}
