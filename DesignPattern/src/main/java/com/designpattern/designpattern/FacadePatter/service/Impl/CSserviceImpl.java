package com.designpattern.designpattern.FacadePatter.service.Impl;

import com.designpattern.designpattern.FacadePatter.model.Facade;
import com.designpattern.designpattern.FacadePatter.service.CService;
import org.springframework.stereotype.Service;

@Service
public class CSserviceImpl implements CService {
    @Override
    public String doC() {
        Facade facade=Facade.getInstance();
        return facade.doA()+" "+facade.doB();
    }
}
