package com.designpattern.designpattern.SimpleFactoryPattern.controller;

import com.designpattern.designpattern.SimpleFactoryPattern.service.SandboxService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/SimpleFactoryPattern")
public class SandboxController {
    @Resource
    SandboxService sandboxService;

    @GetMapping("/sandbox")
    public String newSandbox(String type, HttpServletRequest request) {
        return sandboxService.createSandbox(type);
    }
}
