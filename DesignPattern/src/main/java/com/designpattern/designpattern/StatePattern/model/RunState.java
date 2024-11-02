package com.designpattern.designpattern.StatePattern.model;

public class RunState implements State{

    @Override
    public String message(Context context) {
        context.setState(new StopState());
        return "Stop message";
    }
}
