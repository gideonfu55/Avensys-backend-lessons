package com.java.objects.methods.overloading;

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
    int c = 0;
    if (Integer.class.isInstance(a) && Integer.class.isInstance(b)) {
      c = a / b;
    } else {
      System.out.println("Please provide valid numbers.");
    }

    return c;
  }

  /*
   * Method Overloading
   * 
   * Methods can have similar name, but different signatures:
   * 1. Number of arguments
   * 2. Types of the arguments
   * 3. Order of the arguments
   * 
   * Similar example: substring()
   * stringName.substring(1);
   * stringName.substring(1, 5);
   * 
   * - There are actually two substring methods performing 2 different tasks based on Method Overloading.
   */

  public int addOverload (int a, int b) {
    return a + b;
  }

  public int addOverload(int a, int b, int c) {
    return a + b + c;
  }

  public double addOverload (double a, double b) {
    return a + b;
  }

  public int subtractOverload (int a, int b) {
    return a - b;
  }

  public int subtractOverload(int a, int b, int c) {
    return a - b - c;
  }

  public int subtractOverload(int a, int b, int d, int c) {
    return a - b - c - d;
  }

}
