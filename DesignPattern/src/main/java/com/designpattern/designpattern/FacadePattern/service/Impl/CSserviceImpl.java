package com.designpattern.designpattern.FacadePattern.service.Impl;

import com.designpattern.designpattern.FacadePattern.model.Facade;
import com.designpattern.designpattern.FacadePattern.service.CService;
import org.springframework.stereotype.Service;

@Service
public class CSserviceImpl implements CService {
    @Override
    public String doC() {
        Facade facade=Facade.getInstance();
        return facade.doA()+" "+facade.doB();
    }
}
