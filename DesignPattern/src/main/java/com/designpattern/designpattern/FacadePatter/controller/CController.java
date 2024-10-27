package com.designpattern.designpattern.FacadePatter.controller;

import com.designpattern.designpattern.FacadePatter.service.CService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("FacadePatter")
public class CController {
    @Resource
    CService service;

    @GetMapping("/")
    public String C(){
        return service.doC();
    }
}
