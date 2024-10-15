package com.designpattern.designpattern.SimpleFactoryPattern.service.Impl;

import com.designpattern.designpattern.SimpleFactoryPattern.service.SandboxService;
import com.designpattern.designpattern.SimpleFactoryPattern.model.CodeSandbox;
import com.designpattern.designpattern.SimpleFactoryPattern.model.CodeSandboxFactory;
import org.springframework.stereotype.Service;

@Service
public class SandboxServiceImpl implements SandboxService {
    @Override
    public String createSandbox(String type) {
        CodeSandbox codeSandbox= CodeSandboxFactory.newInstance(type);
        return codeSandbox.executeCode();
    }
}
