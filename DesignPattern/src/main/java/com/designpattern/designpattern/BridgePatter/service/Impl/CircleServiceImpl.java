package com.designpattern.designpattern.BridgePatter.service.Impl;

import com.designpattern.designpattern.BridgePatter.model.Circle;
import com.designpattern.designpattern.BridgePatter.model.GreenCirlce;
import com.designpattern.designpattern.BridgePatter.model.RedCircle;
import com.designpattern.designpattern.BridgePatter.model.Shape;
import com.designpattern.designpattern.BridgePatter.service.CircleService;
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
