package com.dci.intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public String printName(){
        return "Mihai";
    }

//    @Bean annotation denotes that the method below returns a bean
    @Bean
    public List<Integer> printNums(){
        return new ArrayList<>(Arrays.asList(1,2,34,4,5,6));
    }

}
