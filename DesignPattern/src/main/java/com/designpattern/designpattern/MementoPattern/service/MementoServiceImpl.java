package com.designpattern.designpattern.MementoPattern.service;

import com.designpattern.designpattern.MementoPattern.model.A;
import com.designpattern.designpattern.MementoPattern.model.Memento;
import org.springframework.stereotype.Service;

@Service
public class MementoServiceImpl implements MementoService{
    @Override
    public String go() {
        Memento memento = new Memento();
        A a = new A();
        a.setState("11");
        memento.add(new A(a));
        String res="";
        res+=a.getState();
        a.setState("22");
        memento.add(new A(a));
        res+=a.getState();
        a=memento.get(0);
        res+=a.getState();
        return res;
    }
}
