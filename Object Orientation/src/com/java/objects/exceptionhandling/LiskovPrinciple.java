package com.java.objects.exceptionhandling;
class DemoThreeNew {
  // Liskov's Substitution Principle 1:
  // If Exception is thrown in parent class, it is not necessary to throw it in the child class.
  // If an exception is thrown in the child class, this exception itself should have a is-a relationship with the one that's thrown in the parent.
  // If the exception thrown in the child doesn't have an is-a relationship with the first exception, there will be a compiler error
  public void greet() throws Exception {
    System.out.println("Hello Team!");
  }
}

class DemoFour extends DemoThreeNew {
  public void greet() {
    System.out.println("Hello Team from Mario!");
  }
}

public class LiskovPrinciple {
  public static void main(String[] args) {
    System.out.println("Main connection is established.");
    System.out.println("Main connection is closed.");
  }
}
