package com.designpattern.designpattern.SingletonPatter.Controller;

import com.designpattern.designpattern.SingletonPatter.service.ConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/SingletonPatter")
public class ConfigController {

    @Resource
    ConfigService configService;
    @GetMapping
    public String configList(){
        return configService.configList();
    }
}
