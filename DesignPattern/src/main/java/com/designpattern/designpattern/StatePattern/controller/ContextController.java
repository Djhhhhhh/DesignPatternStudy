package com.designpattern.designpattern.StatePattern.controller;

import com.designpattern.designpattern.StatePattern.service.ContextService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("StatePattern")
public class ContextController {
    @Resource
    public ContextService contextService;
    @GetMapping
    public String go(){
        return contextService.go();
    }
}
