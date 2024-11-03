package com.designpattern.designpattern.VisitorPattern.model;

public class A implements P{

    @Override
    public String run(Visitor visitor) {
        return visitor.visitor(this);
    }
}
