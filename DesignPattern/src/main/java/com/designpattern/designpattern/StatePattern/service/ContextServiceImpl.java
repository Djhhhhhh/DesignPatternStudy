package com.designpattern.designpattern.StatePattern.service;

import com.designpattern.designpattern.StatePattern.model.Context;
import com.designpattern.designpattern.StatePattern.model.RunState;
import org.springframework.stereotype.Service;

@Service
public class ContextServiceImpl implements ContextService {

    @Override
    public String go() {
        String result="";
        Context context=new Context();
        context.setState(new RunState());
        result += "/"+context.request();
        result += "/"+context.request();
        result += "/"+context.request();
        result += "/"+context.request();
        return result;
    }
}
