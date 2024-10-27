package com.designpattern.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.designpattern.designpattern."+ "${patter}"})
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }

}
