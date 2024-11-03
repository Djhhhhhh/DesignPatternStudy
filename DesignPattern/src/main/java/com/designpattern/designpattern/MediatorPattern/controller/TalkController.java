package com.designpattern.designpattern.MediatorPattern.controller;

import com.designpattern.designpattern.MediatorPattern.service.TalkServcie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/MediatorPattern")
public class TalkController {
    @Resource
    TalkServcie talkServcie;
    @GetMapping
    public String go(){
        return talkServcie.go();
    }
}
