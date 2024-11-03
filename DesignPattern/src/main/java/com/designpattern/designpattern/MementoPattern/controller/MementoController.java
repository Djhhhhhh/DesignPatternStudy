package com.designpattern.designpattern.MementoPattern.controller;

import com.designpattern.designpattern.MementoPattern.service.MementoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/MementoPattern")
public class MementoController {
    @Resource
    MementoService mementoService;
    @GetMapping
    public String go(){
        return mementoService.go();
    }
}
