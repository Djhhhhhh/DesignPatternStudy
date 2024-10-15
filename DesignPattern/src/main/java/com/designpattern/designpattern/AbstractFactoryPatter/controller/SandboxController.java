package com.designpattern.designpattern.AbstractFactoryPatter.controller;

import com.designpattern.designpattern.AbstractFactoryPatter.service.SandboxService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/AbstractFactoryPatter")
public class SandboxController {
    @Resource
    SandboxService sandboxService;

    @GetMapping("/sandbox")
    public String newSandbox(HttpServletRequest request) {
        return sandboxService.createSandbox();
    }
}
