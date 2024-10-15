package com.designpattern.designpattern.AbstractFactoryPatter.model;

public class RemoteCodeSandboxFactory implements AbstractCodeSandboxFactory {

    @Override
    public CodeSandbox createSandbox() {
        return new RemoteCodeSandbox();
    }
}
