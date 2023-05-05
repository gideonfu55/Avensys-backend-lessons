package com.java.objects.methods;

public class MethodsLesson {
  public static void main(String[] args) {

    Calculator myCal = new Calculator();

    myCal.add();
    myCal.subtract(20, 30);

    int a = 'c';

    int resultMultiple = myCal.multiply();
    int resultDivide = myCal.divide('a', 20);

    System.out.println(resultMultiple);
    System.out.println(resultDivide);
    
  }
}
