package com.designpattern.designpattern.FlyweightPattern.service;

import com.designpattern.designpattern.FlyweightPattern.model.Point;
import com.designpattern.designpattern.FlyweightPattern.model.PointFlyweightFactory;
import org.springframework.stereotype.Service;

@Service
public class PointServiceImpl implements PointService {

    @Override
    public String go() {
        String ans="";
        Point point1 = PointFlyweightFactory.getPoint("red");
        point1.setX(1);
        point1.setY(1);
        ans+= point1.get();
        Point point2 = PointFlyweightFactory.getPoint("red");
        point2.setX(1);
        point2.setY(2);
        ans+= " " +  point2.get();
        return ans;
    }
}
