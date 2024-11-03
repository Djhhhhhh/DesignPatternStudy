package com.designpattern.designpattern.MementoPattern.model;

import lombok.Data;

@Data
public class A {
    String state;
    public A(){
    }
    public A(A a){
        this.state=a.state;
    }
}
