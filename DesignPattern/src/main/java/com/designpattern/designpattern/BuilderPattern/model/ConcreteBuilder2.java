package com.designpattern.designpattern.BuilderPattern.model;

public class ConcreteBuilder2 implements Builder{

    private Product product=new Product();
    @Override
    public void buildWord1() {
        this.product.setWord1("word3");
    }

    @Override
    public void buildWord2() {
        this.product.setWord2("word4");
    }
    public Product getProduct() {
        return product;
    }
}
