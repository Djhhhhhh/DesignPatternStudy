package com.designpattern.designpattern.DecoratorPatetern.model;

public class ShapeDecorator implements Shape{
    protected Shape decorated;

    public ShapeDecorator(Shape decorated){
        this.decorated = decorated;
    }

    @Override
    public String draw() {
        return decorated.draw();
    }
}
