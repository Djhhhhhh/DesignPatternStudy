package com.designpattern.designpattern.ObserverPattern.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Subject {

   private List<Number> numbers = new ArrayList<Number>();
   @Getter
   private int state;

   public String setState(int state) {
      this.state = state;
      return notifyAllNumber();
   }

   public void attach(Number number){
      numbers.add(number);
   }

   public String notifyAllNumber(){
      StringBuilder result= new StringBuilder();
      for (Number number : numbers) {
         result.append(number.update());
      }
      return result.toString();
   }
}