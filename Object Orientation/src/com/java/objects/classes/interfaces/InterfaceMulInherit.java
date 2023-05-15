package com.java.objects.classes.interfaces;

//7. Multiple inheritance is possible using interface in java
interface Calculator1 {
  public void mul();
  public void div();
}

interface Calculator2 {
  public void add();
  public void sub();
}

class MyCalc1 implements Calculator1, Calculator2 {
  public void mul() {
    int a = 10;
    int b = 20;
    int c = a * b;
    System.out.println(c);
  }

  public void div() {
    int a = 10;
    int b = 2;
    int c = a / b;
    System.out.println(c);
  }

  public void add() {
    int a = 10;
    int b = 20;
    int c = a + b;
    System.out.println(c);
  }

  public void sub() {
    int a = 10;
    int b = 20;
    int c = a - b;
    System.out.println(c);
  }
}

public class InterfaceMulInherit {
  public static void main(String[] args) {
    MyCalc1 mc1 = new MyCalc1();
    mc1.mul();
    mc1.div();
    mc1.add();
    mc1.sub();
  }
}
