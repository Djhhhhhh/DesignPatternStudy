package com.designpattern.designpattern.SingletonPattern.model;

import lombok.Getter;

/**
 * 懒汉式单例模式
 */
@Getter
public class LazyConfig {
    private String time;
    private String name;
    private static LazyConfig lazyConfig =null;
    private LazyConfig(){
        initConfig();
        System.out.println("产生实例");
    }
    public static LazyConfig getInstance(){
        if(lazyConfig==null){
            lazyConfig = new LazyConfig();
        }
        return lazyConfig;
    }
    private void initConfig(){
        this.name="Djhhh";
        this.time="Time is now";
    }
}
