package com.designpattern.designpattern.StatePattern.model;

import lombok.Data;

@Data
public class Context {
    private State state;
    public String request(){
        return state.message(this);
    }
}
