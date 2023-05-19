package com.java.objects.exceptionhandling;
import java.util.Scanner;

class DemoTwoNew {
  public void alpha() {
    try {   
      System.out.println("Connection 1 is established.");
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the numerator");
      int a = scan.nextInt();
      System.out.println("Enter the denominator");
      int b = scan.nextInt();
      int c = a / b;
      System.out.println("Result is: " + c);
      System.out.println("Connection 1 is closed.");

      scan.close(); // need to open when running in main again
    }
    catch (Exception e) {
      // System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}

public class StackTraceExp {
  public static void main(String[] args) {
    System.out.println("Main Connection is established");
    DemoTwoNew d1 = new DemoTwoNew();
    d1.alpha();
    System.out.println("Main Connection is closed.");
  }
}
