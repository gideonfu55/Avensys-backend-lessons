package com.java.objects.exceptionhandling;
class DemoOneNew {
  public void alpha() {
    try {
      System.out.println("Connection 3 established.");
      alpha();
    } catch (Error e) {
      System.out.println("Don't keep alpha method in loop");
    }
    System.out.println("Connection 3 is Closed");
  }
}

public class ExceptionLoop {
  public static void main(String[] args) {
    System.out.println("Main Connection is established");
    DemoOne d1 = new DemoOne();
    d1.alpha();
    System.out.println("Main Connection is closed.");
  }
}
