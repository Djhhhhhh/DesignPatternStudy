package com.designpattern.designpattern.ChainOfResponsibilityPattern.service;

import com.designpattern.designpattern.ChainOfResponsibilityPattern.model.Handler;
import org.springframework.stereotype.Service;

@Service
public class HandlerServiceImpl implements HandlerService{
    @Override
    public String go() {
        Handler handler1=new Handler();
        Handler handler2=new Handler();
        Handler handler3=new Handler();
        Handler handler4=new Handler();
        handler1.setAbstractHandler(handler2);
        handler2.setAbstractHandler(handler3);
        handler3.setAbstractHandler(handler4);
        return handler1.log("111");
    }
}
