package com.designpattern.designpattern.MementoPattern.model;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<A> mementoList = new ArrayList<A>();

    public void add(A state){
        mementoList.add(state);
    }

    public A get(int index){
        return mementoList.get(index);
    }
}
