package com.designpattern.designpattern.ObserverPattern.model;

public class BinaryNumber extends Number{
 
   public BinaryNumber(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public String update() {
      return "Binary String: "+ Integer.toBinaryString( subject.getState());
   }
}