package com.designpattern.designpattern.AdapterPatter.service.Impl;

import com.designpattern.designpattern.AdapterPatter.model.Wiring;
import com.designpattern.designpattern.AdapterPatter.service.WiringService;
import org.springframework.stereotype.Service;

@Service
public class WiringServiceImpl implements WiringService {
    @Override
    public String doRecharge() {
        Wiring wiring=new Wiring();
        String s = wiring.recharge("220");
        s +=" " + wiring.recharge("110");
        return s;
    }
}
