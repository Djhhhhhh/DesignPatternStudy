package com.designpattern.designpattern.BridgePatter.model;

public class GreenCirlce implements MadeCircle {

    @Override
    public String makeCircle(int radius, int x, int y) {
        return "半径:"+radius+";颜色:Green;x:"+x+";y:"+y+";";
    }
}
