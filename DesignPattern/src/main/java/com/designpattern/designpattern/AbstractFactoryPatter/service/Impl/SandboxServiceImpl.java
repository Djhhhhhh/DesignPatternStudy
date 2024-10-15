package com.designpattern.designpattern.AbstractFactoryPatter.service.Impl;

import com.designpattern.designpattern.AbstractFactoryPatter.model.*;
import com.designpattern.designpattern.AbstractFactoryPatter.service.SandboxService;
import org.springframework.stereotype.Service;

@Service
public class SandboxServiceImpl implements SandboxService {
    AbstractCodeSandboxFactory abstractCodeSandboxFactory1;
    AbstractCodeSandboxFactory abstractCodeSandboxFactory2;
    @Override
    public String createSandbox() {
        abstractCodeSandboxFactory1=new RemoteCodeSandboxFactory();
        abstractCodeSandboxFactory2=new ThirdCodeSandboxFactory();
        CodeSandbox codeSandbox1=abstractCodeSandboxFactory1.createSandbox();
        CodeSandbox codeSandbox2=abstractCodeSandboxFactory2.createSandbox();
        return codeSandbox1.executeCode()+" "+codeSandbox2.executeCode();
    }
}
