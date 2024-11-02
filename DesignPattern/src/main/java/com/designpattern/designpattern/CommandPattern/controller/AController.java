package com.designpattern.designpattern.CommandPattern.controller;

import com.designpattern.designpattern.CommandPattern.service.AService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("CommandPattern")
public class AController {
    @Resource
    AService service;
    @GetMapping
    public String go(){
        return service.go();
    }
}
