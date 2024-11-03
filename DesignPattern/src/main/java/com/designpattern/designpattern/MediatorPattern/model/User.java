package com.designpattern.designpattern.MediatorPattern.model;

import lombok.Data;

@Data
public class User {
    String name;
    public User(String name){
        this.name=name;
    }
    public String sendMessage(String message){
        return Mediator.message(this,message);
    }
}
