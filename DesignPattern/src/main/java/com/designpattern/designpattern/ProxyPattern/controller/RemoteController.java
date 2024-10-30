package com.designpattern.designpattern.ProxyPattern.controller;

import com.designpattern.designpattern.ProxyPattern.service.RemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ProxyPattern")
public class RemoteController {
    @Resource
    RemoteService service;
    @GetMapping
    public String go(){
        return service.go();
    }
}
