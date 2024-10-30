package com.designpattern.designpattern.ProxyPattern.model;

public class RemoteClient implements Client{

    @Override
    public String getAns() {
        return "远程客户端";
    }
}
