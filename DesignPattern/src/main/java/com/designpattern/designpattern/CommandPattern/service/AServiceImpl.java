package com.designpattern.designpattern.CommandPattern.service;

import com.designpattern.designpattern.CommandPattern.model.A;
import com.designpattern.designpattern.CommandPattern.model.Manager;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService{
    @Override
    public String go() {
        Manager manager=new Manager();
        manager.addCommand(new A());
        manager.addCommand(new A());
        manager.addCommand(new A());
        return manager.executeCommand();
    }
}
