package com.java.objects.methods;

public class Calculator {
  // Type  1: no input and no output - add() method
  public void add() {
    int a = 10;
    int b = 30;
    int c = a + b;
    System.out.println(c);
  }

  // Type 2: gets input and produce no output
  public void subtract(int a, int b) {
    if (Integer.class.isInstance(a) && Integer.class.isInstance(b)) {
      int c = a - b;
      System.out.println(c);
    } else {
      System.out.println("Provide valid numbers");
    }
  }

  // Type 3: No input and produce output
  public int multiply() {
    int a = 5;
    int b = 5;
    int c = a * b;
    return c;
  }

  // Type 4: Gets input and produce output
  public int divide(int a, int b) {
    int c = a / b;
    return c;
  }

}
