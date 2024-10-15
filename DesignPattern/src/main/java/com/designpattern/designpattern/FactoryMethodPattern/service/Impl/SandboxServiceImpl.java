package com.designpattern.designpattern.FactoryMethodPattern.service.Impl;

import com.designpattern.designpattern.FactoryMethodPattern.model.CodeSandbox;
import com.designpattern.designpattern.FactoryMethodPattern.model.RemoteCodeSandboxFactory;
import com.designpattern.designpattern.FactoryMethodPattern.model.ThirdCodeSandboxFactory;
import com.designpattern.designpattern.FactoryMethodPattern.service.SandboxService;
import com.designpattern.designpattern.FactoryMethodPattern.model.CodeSandboxFactory;
import org.springframework.stereotype.Service;

@Service
public class SandboxServiceImpl implements SandboxService {
    @Override
    public String createSandbox() {
        CodeSandboxFactory codeSandboxFactory1=new RemoteCodeSandboxFactory();
        CodeSandboxFactory codeSandboxFactory2=new ThirdCodeSandboxFactory();
        CodeSandbox codeSandbox1=codeSandboxFactory1.newInstance();
        CodeSandbox codeSandbox2=codeSandboxFactory2.newInstance();
        return codeSandbox1.executeCode() + " "+codeSandbox2.executeCode();
    }
}
