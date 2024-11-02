package com.designpattern.designpattern.ChainOfResponsibilityPattern.model;


import lombok.Setter;

public class Handler extends AbstractHandler{

    public String log(String s){
        return this.logMessage(s);
    }
}
