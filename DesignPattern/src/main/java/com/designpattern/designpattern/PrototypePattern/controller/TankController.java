package com.designpattern.designpattern.PrototypePattern.controller;

import com.designpattern.designpattern.PrototypePattern.service.TankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/PrototypePatter")
public class TankController {
    @Resource
    TankService tankService;

    @GetMapping
    public String getManyTank() throws CloneNotSupportedException {
        return tankService.tankList();
    }
}
