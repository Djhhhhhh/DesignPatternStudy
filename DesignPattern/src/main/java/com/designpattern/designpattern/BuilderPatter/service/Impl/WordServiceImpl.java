package com.designpattern.designpattern.BuilderPatter.service.Impl;

import com.designpattern.designpattern.BuilderPatter.model.ConcreteBuilder1;
import com.designpattern.designpattern.BuilderPatter.model.ConcreteBuilder2;
import com.designpattern.designpattern.BuilderPatter.model.Director;
import com.designpattern.designpattern.BuilderPatter.service.WordService;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {
    @Override
    public String word() {
        String result="";
        ConcreteBuilder1 builder1=new ConcreteBuilder1();
        ConcreteBuilder2 builder2=new ConcreteBuilder2();
        Director director=new Director(builder1);
        director.construct();
        result+=builder1.getProduct().toString();
        director.setBuilder(builder2);
        director.construct();
        result+='\n'+builder2.getProduct().toString();
        return result;
    }
}
