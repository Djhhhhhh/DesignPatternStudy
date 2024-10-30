package com.designpattern.designpattern.TemplatePattern.controller;

import com.designpattern.designpattern.TemplatePattern.service.DoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("TemplatePattern")
public class DoController {
    @Resource
    DoService service;
    @GetMapping
    public String go(){
        return service.go();
    }
}
