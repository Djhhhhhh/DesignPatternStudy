package com.designpattern.designpattern.TemplatePattern.service;

import com.designpattern.designpattern.TemplatePattern.model.DoOutP;
import org.springframework.stereotype.Service;

@Service
public class DoServiceImpl implements DoService{

    @Override
    public String go() {
        return new DoOutP().dododo();
    }
}
