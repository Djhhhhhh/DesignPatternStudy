package com.designpattern.designpattern.BridgePattern.model;

public class RedCircle implements MadeCircle{

    @Override
    public String makeCircle(int radius, int x, int y) {
        return "半径:"+radius+";颜色:Red;x:"+x+";y:"+y+";";
    }
}
