package com.designpattern.designpattern.ProxyPattern.service;

import com.designpattern.designpattern.ProxyPattern.model.ClientProxy;
import org.springframework.stereotype.Service;

@Service
public class RemoteServiceImpl implements RemoteService {

    @Override
    public String go() {
        ClientProxy proxy=new ClientProxy();
        return proxy.getAns();
    }
}
