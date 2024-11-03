package com.designpattern.designpattern.VisitorPattern.model;

public class DisaplayVisitor implements Visitor{

    @Override
    public String visitor(A a) {
        return "AAAA";
    }

    @Override
    public String visitor(B a) {
        return "BBBB";
    }
}
