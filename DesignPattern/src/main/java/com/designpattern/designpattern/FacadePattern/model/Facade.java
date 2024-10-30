package com.designpattern.designpattern.FacadePattern.model;

public class Facade {
    private static Facade facade=new Facade();
    private C1 c1;
    private C2 c2;
    private C3 c3;
    private Facade(){
        c1=new C1();
        c2=new C2();
        c3=new C3();
    }
    public static Facade getInstance(){
        return facade;
    }
    public String doA(){
        return this.c1.go();
    }
    public String doB(){
        return this.c1.go()+" "+this.c2.go()+" "+this.c3.go();
    }
}
