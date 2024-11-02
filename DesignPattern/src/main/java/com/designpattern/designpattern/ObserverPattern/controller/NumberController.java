package com.designpattern.designpattern.ObserverPattern.controller;

import com.designpattern.designpattern.ObserverPattern.service.NumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ObserverPattern")
public class NumberController {
    @Resource
    NumberService numberService;
    @GetMapping
    public String go(){
        return numberService.go();
    }
}
