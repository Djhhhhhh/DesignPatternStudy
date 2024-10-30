package com.designpattern.designpattern.FlyweightPattern.model;

import java.util.HashMap;

public class PointFlyweightFactory {
    private static final HashMap<String,Point>p=new HashMap<>();
    public static Point getPoint(String color){
        Point point=p.get(color);
        if(point==null){
            point=new Point(color);
            p.put(color,point);
        }
        return point;
    }
}
