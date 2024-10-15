package com.designpattern.designpattern.AbstractFactoryPatter.model;

public class RemoteCodeSandbox implements CodeSandbox {

    @Override
    public String executeCode() {
        return "远程代码沙箱";
    }
}
