package com.designpattern.designpattern.VisitorPattern.controller;

import com.designpattern.designpattern.VisitorPattern.service.PpService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/VisitorPattern")
public class PpController {
    @Resource
    PpService service;
    @GetMapping
    public String go(){
        return service.go();
    }
}
