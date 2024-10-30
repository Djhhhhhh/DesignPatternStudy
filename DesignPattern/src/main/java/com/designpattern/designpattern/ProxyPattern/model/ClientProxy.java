package com.designpattern.designpattern.ProxyPattern.model;

public class ClientProxy implements Client{
    RemoteClient client;

    @Override
    public String getAns() {
        if(client==null){
            client= new RemoteClient();
        }
        return client.getAns();
    }
}
