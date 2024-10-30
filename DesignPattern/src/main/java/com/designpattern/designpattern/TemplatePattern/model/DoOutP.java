package com.designpattern.designpattern.TemplatePattern.model;

public class DoOutP implements DoOut{
    @Override
    public String doA() {
        return "A";
    }

    @Override
    public String doB() {
        return "B";
    }

    @Override
    public String doC() {
        return "C";
    }

    public String dododo(){
        return this.doA()+" "+this.doB()+" "+this.doC();
    }
}
