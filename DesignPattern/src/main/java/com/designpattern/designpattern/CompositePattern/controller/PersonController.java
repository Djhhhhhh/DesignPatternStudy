package com.designpattern.designpattern.CompositePattern.controller;

import com.designpattern.designpattern.CompositePattern.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/CompositePatter")
public class PersonController {
    @Resource
    PersonService service;
    @GetMapping
    public String go(){
        return service.doPeroson();
    }
}
