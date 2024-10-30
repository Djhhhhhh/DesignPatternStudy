package com.designpattern.designpattern.DecoratorPatetern.service;

import com.designpattern.designpattern.DecoratorPatetern.model.Circle;
import com.designpattern.designpattern.DecoratorPatetern.model.RedCircleDecorator;
import org.springframework.stereotype.Service;

@Service
public class ShapeServiceImpl implements ShapeService {
    @Override
    public String draw() {
        Circle circle=new Circle();
        RedCircleDecorator redCircleDecorator=new RedCircleDecorator(new Circle());
        return circle.draw()+"     "+redCircleDecorator.draw();
    }
}
