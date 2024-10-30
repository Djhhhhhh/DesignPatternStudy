package com.designpattern.designpattern.StrategyPattern.model;

public class DoAlgorithm {
    public String algorithm(int a){
        if(a<=1000){
            return "纯暴力";
        }else{
            return "其他算法";
        }
    }
}
