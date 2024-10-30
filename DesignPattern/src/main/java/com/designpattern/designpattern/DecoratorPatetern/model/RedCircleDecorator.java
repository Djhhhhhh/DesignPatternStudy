package com.designpattern.designpattern.DecoratorPatetern.model;

public class RedCircleDecorator extends ShapeDecorator{
    public RedCircleDecorator(Shape shape){
        super(shape);
    }

    @Override
    public String draw(){
        return decorated.draw()+"+红色";
    }
}
