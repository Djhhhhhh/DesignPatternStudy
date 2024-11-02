package com.designpattern.designpattern.CommandPattern.model;

import java.util.ArrayList;

public class Manager {
    private final ArrayList<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public String executeCommand() {
        StringBuilder result= new StringBuilder();
        for (Command command : commands) {
            result.append(command.excute());
        }
        commands.clear();
        return result.toString();
    }
}
