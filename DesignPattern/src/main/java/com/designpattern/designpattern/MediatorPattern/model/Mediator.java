package com.designpattern.designpattern.MediatorPattern.model;

public class Mediator {
    public static String message(User user,String message){
        return user+":"+message+"---->";
    }
}
