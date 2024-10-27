package com.designpattern.designpattern.AdapterPatter.controller;

import com.designpattern.designpattern.AdapterPatter.model.Wiring;
import com.designpattern.designpattern.AdapterPatter.service.WiringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AdapterPatter")
public class WiringController {
    @Resource
    WiringService service;
    @GetMapping
    public String Wiring(){
        return service.doRecharge();
    }
}
