package com.designpattern.designpattern.AdapterPattern.model;

public class OldWiring implements Recharge{

    @Override
    public String recharge220() {
        return "不充";
    }

    @Override
    public String recharge110() {
        return "充110";
    }
}
