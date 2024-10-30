package com.designpattern.designpattern.FlyweightPattern.model;

import lombok.Data;
import lombok.Getter;

@Data
public class Point implements Shape{
    private int x;
    private int y;
    private String color;

    public Point(String col){
        this.color=col;
    }

    @Override
    public String get() {
        return this.x+this.y+this.color;
    }
}
