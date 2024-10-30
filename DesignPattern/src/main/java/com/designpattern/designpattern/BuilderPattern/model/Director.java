package com.designpattern.designpattern.BuilderPattern.model;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.buildWord1();
        builder.buildWord2();
    }
}
