package com.designpattern.designpattern.BridgePattern.model;

public abstract class Shape {
    protected MadeCircle madeCircle;
    protected Shape(MadeCircle madeCircle){
        this.madeCircle=madeCircle;
    }
    public abstract String made();
}
