package com.designpattern.designpattern.AbstractFactoryPatter.model;

public class ThirdCodeSandboxFactory implements AbstractCodeSandboxFactory {

    @Override
    public CodeSandbox createSandbox() {
        return new ThirdCodeSandbox();
    }
}
