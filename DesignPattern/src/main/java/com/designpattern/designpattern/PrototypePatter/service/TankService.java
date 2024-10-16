package com.designpattern.designpattern.PrototypePatter.service;

import org.springframework.stereotype.Service;

@Service
public interface TankService {
    public String tankList() throws CloneNotSupportedException;
}
