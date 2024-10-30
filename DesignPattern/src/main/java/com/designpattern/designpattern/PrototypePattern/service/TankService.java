package com.designpattern.designpattern.PrototypePattern.service;

import org.springframework.stereotype.Service;

@Service
public interface TankService {
    public String tankList() throws CloneNotSupportedException;
}
