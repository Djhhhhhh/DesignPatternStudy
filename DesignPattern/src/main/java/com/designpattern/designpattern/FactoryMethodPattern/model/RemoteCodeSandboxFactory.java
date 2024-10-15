package com.designpattern.designpattern.FactoryMethodPattern.model;

public class RemoteCodeSandboxFactory extends CodeSandboxFactory{
    @Override
    public CodeSandbox newInstance() {
        return new RemoteCodeSandbox();
    }

}
