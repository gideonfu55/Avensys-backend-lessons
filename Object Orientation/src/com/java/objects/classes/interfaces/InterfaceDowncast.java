package com.java.objects.classes.interfaces;

interface CalculatorTwo {
  public void mul();
  public void div();
}

class MyCalcOne implements CalculatorTwo {
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
}

class Math {
  public void acceptCalculator(CalculatorTwo ref) {
    ref.mul();
    ref.div();
    ((MyCalcOne) ref).add(); // 6. Parent type reference can access child class specialized methods after
                           // down casting
  }
}

class InterfaceDowncast extends Object {
  public static void main(String[] args) {
    MyCalcOne mc1 = new MyCalcOne();
    Math m = new Math();
    m.acceptCalculator(mc1);
  }
}