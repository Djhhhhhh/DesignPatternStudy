package com.designpattern.designpattern.PrototypePattern.service.Impl;

import com.designpattern.designpattern.PrototypePattern.model.Tank;
import com.designpattern.designpattern.PrototypePattern.service.TankService;
import org.springframework.stereotype.Service;

@Service
public class TankServiceImpl implements TankService {
    @Override
    public String tankList() throws CloneNotSupportedException {
        StringBuilder result = new StringBuilder();
        Tank tank = new Tank();
        tank.setTank(new Tank()); // 初始化 tank 属性
        result.append("创建tank原型").append(tank).append(",子弹类型为:").append(tank.getBullet());
        tank.setBullet("bb");
        for (int i = 1; i <= 10; i++) {
            result.append("创建tank原型").append(i).append("号");
            Tank tank1 = (Tank) tank.clone();
            result.append(tank1);
            tank1.setBullet(tank1.getBullet() + i);
            result.append("子弹类型:").append(tank1.getBullet());
        }
        return result.toString();
    }
}
