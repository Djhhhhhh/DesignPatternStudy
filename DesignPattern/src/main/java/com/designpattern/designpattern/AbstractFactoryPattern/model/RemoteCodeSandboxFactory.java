package com.designpattern.designpattern.AbstractFactoryPattern.model;

public class RemoteCodeSandboxFactory implements AbstractCodeSandboxFactory {

    @Override
    public CodeSandbox createSandbox() {
        return new RemoteCodeSandbox();
    }
}
