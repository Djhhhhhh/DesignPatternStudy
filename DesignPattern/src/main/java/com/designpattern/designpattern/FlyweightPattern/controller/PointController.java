package com.designpattern.designpattern.FlyweightPattern.controller;

import com.designpattern.designpattern.FlyweightPattern.service.PointService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/FlyweightPatter")
public class PointController {
    @Resource
    PointService service;
    @GetMapping
    public String go(){
        return service.go();
    }
}
