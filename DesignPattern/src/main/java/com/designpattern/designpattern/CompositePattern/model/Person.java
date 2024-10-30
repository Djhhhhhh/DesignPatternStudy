package com.designpattern.designpattern.CompositePattern.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Person {
    private String name;
    private String id;
    private String job;
    private ArrayList<Person> people;
    public Person(String id,String name,String job){
        this.job=job;
        this.id=id;
        this.name=name;
        this.people=new ArrayList<Person>();
    }
    public void add(Person person){
        this.people.add(person);
    }
    public void remove(Person person){
        this.people.remove(person);
    }
}
