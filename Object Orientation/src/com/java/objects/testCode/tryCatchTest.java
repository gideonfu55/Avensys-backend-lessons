package com.java.objects.testCode;

public class tryCatchTest {
  public static void main(String[] args) {
    try {
      int a = 0;
      System.out.println("a = " + a);
      int b = 20 / a;
      System.out.println("b = " + b);

      // System.out.println("Hello" + " " + 1 / 0);

      // int a, b;
      // b = 0;
      // a = 5 / b;
      // System.out.print("A");
      // int i, sum;
      // sum = 10;
      // for (i = -1; i <3; i++) {
      //   sum = (sum / i);
      // }
    }
    
    catch (ArithmeticException e) {
      System.out.println("Divide by zero error");
      // System.out.println("World");
      // System.out.print("B");
      // System.out.print("0");
    }

    finally {
      System.out.println("inside the finally block");
      // System.out.print(sum);
      // System.out.print("C");
    }

  }
}
