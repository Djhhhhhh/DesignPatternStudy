package com.designpattern.designpattern.AdapterPatter.model;

public class NewWiring implements Recharge{

    @Override
    public String recharge220() {
        return "充220";
    }

    @Override
    public String recharge110() {
        return "不充";
    }
}
