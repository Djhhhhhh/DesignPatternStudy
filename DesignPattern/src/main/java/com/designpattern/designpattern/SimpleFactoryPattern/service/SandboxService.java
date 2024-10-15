package com.designpattern.designpattern.SimpleFactoryPattern.service;

import org.springframework.stereotype.Service;

@Service
public interface SandboxService {
    String createSandbox(String type);
}
