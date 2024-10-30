package com.designpattern.designpattern.CompositePattern.service.Impl;

import com.designpattern.designpattern.CompositePattern.model.Person;
import com.designpattern.designpattern.CompositePattern.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public String doPeroson() {
        Person ceo=new Person("1","ceo","ceo");
        Person manager=new Person("4","manager","manager");
        Person clerk1=new Person("2","clerk1","clerk");
        Person clerk2=new Person("3","clerk2","clerk");
        ceo.add(manager);
        manager.add(clerk1);
        manager.add(clerk2);
        StringBuilder s= new StringBuilder();
        for(Person x:ceo.getPeople()){
            for(Person y:x.getPeople()){
                s.append(y.getId()).append(" ").append(y.getName()).append(" ").append(y.getJob());
            }
        }
        return s.toString();
    }
}
