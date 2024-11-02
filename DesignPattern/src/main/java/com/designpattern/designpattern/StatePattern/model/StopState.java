package com.designpattern.designpattern.StatePattern.model;

public class StopState implements State {
    @Override
    public String message(Context context) {
        context.setState(new RunState());
        return "Run message";
    }
}
