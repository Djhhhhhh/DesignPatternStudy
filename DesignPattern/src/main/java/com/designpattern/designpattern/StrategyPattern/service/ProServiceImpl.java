package com.designpattern.designpattern.StrategyPattern.service;

import com.designpattern.designpattern.StrategyPattern.model.DoAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class ProServiceImpl implements ProService{
    @Override
    public String go() {
        String s="";
        s+= " 100:"+new DoAlgorithm().algorithm(100);
        s+= " 1000:"+new DoAlgorithm().algorithm(1000);
        s+= " 10000:"+new DoAlgorithm().algorithm(10000);
        s+= " 100000:"+new DoAlgorithm().algorithm(100000);
        return s;
    }
}
