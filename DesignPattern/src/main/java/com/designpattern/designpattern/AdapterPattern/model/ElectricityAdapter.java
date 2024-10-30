package com.designpattern.designpattern.AdapterPattern.model;

public class ElectricityAdapter implements Electricity{
    Recharge recharge;
    public ElectricityAdapter(String type){
        if("220".equals(type)){
            recharge = new NewWiring();
        }else{
            recharge = new OldWiring();
        }
    }
    @Override
    public String recharge(String type) {
        if(type.equals("220")){
           return recharge.recharge220();
        }else{
           return recharge.recharge110();
        }
    }
}
