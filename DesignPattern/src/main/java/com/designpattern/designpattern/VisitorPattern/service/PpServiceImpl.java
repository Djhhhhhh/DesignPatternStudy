package com.designpattern.designpattern.VisitorPattern.service;

import com.designpattern.designpattern.VisitorPattern.model.A;
import com.designpattern.designpattern.VisitorPattern.model.B;
import com.designpattern.designpattern.VisitorPattern.model.DisaplayVisitor;
import org.springframework.stereotype.Service;

@Service
public class PpServiceImpl implements PpService{

    @Override
    public String go() {
        A a = new A();
        B b=new B();
        return a.run(new DisaplayVisitor())+b.run(new DisaplayVisitor());
    }
}
