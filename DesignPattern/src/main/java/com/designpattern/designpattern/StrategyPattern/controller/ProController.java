package com.designpattern.designpattern.StrategyPattern.controller;

import com.designpattern.designpattern.StrategyPattern.service.ProService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/StrategyPattern")
public class ProController {
    @Resource
    ProService service;
    @GetMapping
    public String go(){
        return service.go();
    }
}

