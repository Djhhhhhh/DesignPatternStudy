package com.designpattern.designpattern.SingletonPatter.model;

import lombok.Getter;

/**
 * 饿汉式单例模式
 */
@Getter
public class HungryConfig {
    private String time;
    private String name;
    private static HungryConfig hungrySingleConfig =null;
    private HungryConfig(){
        initConfig();
        System.out.println("产生实例");
    }
    public static HungryConfig getInstance(){
        if(hungrySingleConfig==null){
            hungrySingleConfig = new HungryConfig();
        }
        return hungrySingleConfig;
    }
    private void initConfig(){
        this.name="Djhhh";
        this.time="Time is now";
    }
}
