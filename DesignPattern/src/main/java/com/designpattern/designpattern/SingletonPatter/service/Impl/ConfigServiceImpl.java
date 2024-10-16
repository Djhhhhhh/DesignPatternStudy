package com.designpattern.designpattern.SingletonPatter.service.Impl;

import com.designpattern.designpattern.SingletonPatter.model.HungryConfig;
import com.designpattern.designpattern.SingletonPatter.model.LazyConfig;
import com.designpattern.designpattern.SingletonPatter.service.ConfigService;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {
    @Override
    public String configList() {
        String result="";
        result+="准备创建懒汉式实例\n";
        LazyConfig lazySingletonConfig= LazyConfig.getInstance();
        result+=lazySingletonConfig.getName()+"\n";
        result+=lazySingletonConfig.getTime()+"\n";
        result+="准备创建饿汉式实例\n";
        HungryConfig hungryConfig = HungryConfig.getInstance();
        result+= hungryConfig.getName()+"\n";
        result+= hungryConfig.getTime()+"\n";
        return result;
    }
}
