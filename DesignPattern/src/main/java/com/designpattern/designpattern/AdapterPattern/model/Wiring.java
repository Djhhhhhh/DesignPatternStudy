package com.designpattern.designpattern.AdapterPattern.model;

public class Wiring implements Electricity{
    ElectricityAdapter electricityAdapter;
    @Override
    public String recharge(String type){
        electricityAdapter=new ElectricityAdapter(type);
        return electricityAdapter.recharge(type);
    }
}
