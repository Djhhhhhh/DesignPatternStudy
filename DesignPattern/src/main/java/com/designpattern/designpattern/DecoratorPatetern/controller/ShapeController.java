package com.designpattern.designpattern.DecoratorPatetern.controller;

import com.designpattern.designpattern.DecoratorPatetern.service.ShapeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/DecoratorPatter")
public class ShapeController {
    @Resource
    ShapeService service;

    @GetMapping
    public String go(){
        return service.draw();
    }
}
