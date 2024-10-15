package com.designpattern.designpattern.SimpleFactoryPattern.model;


public class ThirdPartyCodeSandbox implements CodeSandbox {

    @Override
    public String executeCode(){
        return "第三方代码沙箱";
    }
}
