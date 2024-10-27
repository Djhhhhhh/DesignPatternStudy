package com.designpattern.designpattern.BridgePatter.model;

public abstract class Shape {
    protected MadeCircle madeCircle;
    protected Shape(MadeCircle madeCircle){
        this.madeCircle=madeCircle;
    }
    public abstract String made();
}
