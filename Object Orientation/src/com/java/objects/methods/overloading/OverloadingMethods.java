package com.java.objects.methods.overloading;

public class OverloadingMethods {

  public static void main(String[] args) {

    Calculator calOverload = new Calculator();
    System.out.println(calOverload.addOverload(10, 10));
    System.out.println(calOverload.addOverload(10.00, 10.00));
    
  }

}
