package com.designpattern.designpattern.ObserverPattern.service;

import com.designpattern.designpattern.ObserverPattern.model.BinaryNumber;
import com.designpattern.designpattern.ObserverPattern.model.Subject;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService{
    @Override
    public String go() {
        Subject subject=new Subject();
        new BinaryNumber(subject);
        return subject.setState(15);
    }
}
