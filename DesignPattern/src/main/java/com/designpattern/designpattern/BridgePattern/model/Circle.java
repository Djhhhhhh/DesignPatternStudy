package com.designpattern.designpattern.BridgePattern.model;

public class Circle extends Shape{
    private int x,y,radius;
    public Circle(int x,int y,int radius,MadeCircle madeCircle){
        super(madeCircle);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override
    public String made() {
        return madeCircle.makeCircle(radius,x,y);
    }
}
