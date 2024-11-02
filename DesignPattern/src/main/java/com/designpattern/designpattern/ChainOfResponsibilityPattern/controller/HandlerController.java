package com.designpattern.designpattern.ChainOfResponsibilityPattern.controller;

import com.designpattern.designpattern.ChainOfResponsibilityPattern.service.HandlerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("ChainOfResponsibilityPattern")
public class HandlerController {
    @Resource
    HandlerService handlerService;
    @GetMapping
    public String go(){
        return handlerService.go();
    }
}
