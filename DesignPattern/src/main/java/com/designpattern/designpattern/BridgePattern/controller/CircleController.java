package com.designpattern.designpattern.BridgePattern.controller;

import com.designpattern.designpattern.BridgePattern.service.CircleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/BridgePatter")
public class CircleController {
    @Resource
    CircleService service;
    @GetMapping
    public String make(){
        return service.makeCircle();
    }
}
