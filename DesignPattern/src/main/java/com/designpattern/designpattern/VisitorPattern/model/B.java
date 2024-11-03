package com.designpattern.designpattern.VisitorPattern.model;

public class B implements P{

    @Override
    public String run(Visitor visitor) {
        return visitor.visitor(this);
    }
}
