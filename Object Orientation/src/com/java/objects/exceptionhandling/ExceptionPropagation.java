package com.java.objects.exceptionhandling;
import java.util.Scanner;

class DemoOne {

  public void alpha() {
    System.out.println("Connection 3 is established");

    Scanner scan = new Scanner(System.in);

    // Example 1:
    System.out.println("Enter the numerator:");
    int a = scan.nextInt();

    // Arithmetic Exception occurs if zero is placed:
    // - Problem: it leads to a application crash that's abrupt and uncontrolled.
    System.out.println("Enter the denominator:");
    int b = scan.nextInt();

    int c = a / b;
    System.out.println("Result of the operation: " + c);
    System.out.println("Connection 3 is closed.");

    scan.close(); // need to open when running in main again
  }
}

class DemoTwo {
  public void beta() {
    System.out.println("Connection 2 is established.");

    DemoOne d1 = new DemoOne();
    d1.alpha();
    System.out.println("Connection 2 is closed.");
  }
}

class DemoThree {
  public void gamma() {
    System.out.println("Connection 1 is established");
    DemoTwo d2 = new DemoTwo();
    d2.beta();
    System.out.println("Connection 1 is closed.");
  }
}

public class ExceptionPropagation {
  public static void main(String[] args) {
    System.out.println("Main connection is established");
    DemoThree d3 = new DemoThree();
    d3.gamma();
    System.out.println("Main connection is closed.");
  }
}
