package com.designpattern.designpattern.BridgePattern.service.Impl;

import com.designpattern.designpattern.BridgePattern.model.Circle;
import com.designpattern.designpattern.BridgePattern.model.GreenCirlce;
import com.designpattern.designpattern.BridgePattern.model.RedCircle;
import com.designpattern.designpattern.BridgePattern.model.Shape;
import com.designpattern.designpattern.BridgePattern.service.CircleService;
import org.springframework.stereotype.Service;

@Service
public class CircleServiceImpl implements CircleService {

    @Override
    public String makeCircle() {
        Shape redCircle=new Circle(1,1,1,new RedCircle());
        Shape greenCircle=new Circle(1,1,1,new GreenCirlce());
        return redCircle.made()+greenCircle.made();
    }
}
