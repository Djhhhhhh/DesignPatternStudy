package com.designpattern.designpattern.BuilderPatter.controller;

import com.designpattern.designpattern.BuilderPatter.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/BuilderPatter")
public class WordController {
    @Resource
    WordService service;

    @GetMapping("/word")
    public String getWord(){
        return service.word();
    }
}
