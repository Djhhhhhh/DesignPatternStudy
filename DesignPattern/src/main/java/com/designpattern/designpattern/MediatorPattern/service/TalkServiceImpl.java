package com.designpattern.designpattern.MediatorPattern.service;

import com.designpattern.designpattern.MediatorPattern.model.User;
import org.springframework.stereotype.Service;

@Service
public class TalkServiceImpl implements TalkServcie{

    @Override
    public String go() {
        User a=new User("aa");
        User b=new User("bb");
        String result="";
        result+=a.sendMessage("WoShiAa");
        result+=b.sendMessage("WoShiBb");
        return result;
    }
}
