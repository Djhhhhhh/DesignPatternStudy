package com.designpattern.designpattern.SingletonPattern.model;

import lombok.Getter;

/**
 * 饿汉式单例模式
 */
@Getter
public class HungryConfig {
    private String time;
    private String name;
    private static HungryConfig hungrySingleConfig = new HungryConfig();
    private HungryConfig(){
        initConfig();
        System.out.println("产生实例");
    }
    public static HungryConfig getInstance(){
        return hungrySingleConfig;
    }
    private void initConfig(){
        this.name="Djhhh";
        this.time="Time is now";
    }
}
