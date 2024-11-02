package com.designpattern.designpattern.ChainOfResponsibilityPattern.model;

import lombok.Setter;

public abstract class AbstractHandler {

    @Setter
    protected AbstractHandler abstractHandler;

    public String logMessage(String message){
        if(abstractHandler!=null){
             return message +"-"+ abstractHandler.logMessage(message);
        }
        return "-end";
    }
}
