package com.designpattern.designpattern.BuilderPattern.model;

public class ConcreteBuilder1 implements Builder{

    private Product product=new Product();
    @Override
    public void buildWord1() {
        this.product.setWord1("word1");
    }
    @Override
    public void buildWord2() {
        this.product.setWord2("word2");
    }
    public Product getProduct() {
        return product;
    }
}
