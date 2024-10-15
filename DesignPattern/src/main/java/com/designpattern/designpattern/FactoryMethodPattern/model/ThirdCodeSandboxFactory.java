package com.designpattern.designpattern.FactoryMethodPattern.model;

public class ThirdCodeSandboxFactory extends CodeSandboxFactory{

    @Override
    public CodeSandbox newInstance() {
        return new ThirdCodeSandbox();
    }
}
