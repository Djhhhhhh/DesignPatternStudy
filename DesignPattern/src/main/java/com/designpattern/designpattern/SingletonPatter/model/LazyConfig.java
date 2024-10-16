package com.designpattern.designpattern.SingletonPatter.model;

import lombok.Getter;

/**
 * 懒汉式单例模式
 */
@Getter
public class LazyConfig {
    private String time;
    private String name;
    private static final LazyConfig lazySingletonConfig = new LazyConfig();
    private LazyConfig(){
        initConfig();
        System.out.println("产生实例");
    }
    public static LazyConfig getInstance(){
        return lazySingletonConfig;
    }
    private void initConfig(){
        this.name="Djhhh";
        this.time="Time is now";
    }
}
