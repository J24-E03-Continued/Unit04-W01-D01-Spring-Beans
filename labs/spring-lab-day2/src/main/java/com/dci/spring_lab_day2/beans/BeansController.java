package com.dci.spring_lab_day2.beans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeansController {
    private final SingletonBean singletonBean1;
    private final SingletonBean singletonBean2;
    private final SingletonBean singletonBean3;
    private final PrototypeBean prototypeBean1;
    private final PrototypeBean prototypeBean2;
    private final PrototypeBean prototypeBean3;

    public BeansController(SingletonBean singletonBean1, SingletonBean singletonBean2, SingletonBean singletonBean3, PrototypeBean prototypeBean1, PrototypeBean prototypeBean2, PrototypeBean prototypeBean3) {
        this.singletonBean1 = singletonBean1;
        this.singletonBean2 = singletonBean2;
        this.singletonBean3 = singletonBean3;
        this.prototypeBean1 = prototypeBean1;
        this.prototypeBean2 = prototypeBean2;
        this.prototypeBean3 = prototypeBean3;
    }

    @GetMapping("/test-scope")
    public String testScope() {
        System.out.println("Testing bean scopes...");
        System.out.println("Singleton bean: " + singletonBean1);
        System.out.println("Singleton bean: " + singletonBean2);
        System.out.println("Singleton bean: " + singletonBean3);
        System.out.println("Prototype bean 1: " + prototypeBean1);
        System.out.println("Prototype bean 2: " + prototypeBean2);
        System.out.println("Prototype bean 3: " + prototypeBean3);

        return "<h1>Check the console to see the difference between Singleton and Prototype Instances.</h1>";
    }
}
