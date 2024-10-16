package com.designpattern.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//工厂方法模式 /FactoryMethodPattern/sandbox
//@ComponentScan(basePackages = {"com.designpattern.designpattern.FactoryMethodPattern"})
//简单工厂模式 /SimpleFactoryPattern/sandbox?type=???
//@ComponentScan(basePackages = {"com.designpattern.designpattern.SimpleFactoryPattern"})
//抽象工厂模式 /AbstractFactoryPatter/sandbox
//@ComponentScan(basePackages = {"com.designpattern.designpattern.AbstractFactoryPatter"})
//单例模式 /SingletonPatter
//@ComponentScan(basePackages = {"com.designpattern.designpattern.SingletonPatter"})
//原型模式 /PrototypePatter
@ComponentScan(basePackages = {"com.designpattern.designpattern.PrototypePatter"})
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }

}
