package com.designpattern.designpattern.PrototypePattern.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tank implements Cloneable {
    private String bullet;
    private Tank tank;
    public Tank(){
        this.bullet="子弹未配置";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Tank tank= (Tank) super.clone();
        if (this.tank != null) {
            tank.tank = (Tank) this.tank.clone();
        }
        return tank;
    }
}
