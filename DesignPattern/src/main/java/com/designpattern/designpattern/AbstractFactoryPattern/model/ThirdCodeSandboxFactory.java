package com.designpattern.designpattern.AbstractFactoryPattern.model;

public class ThirdCodeSandboxFactory implements AbstractCodeSandboxFactory {

    @Override
    public CodeSandbox createSandbox() {
        return new ThirdCodeSandbox();
    }
}
