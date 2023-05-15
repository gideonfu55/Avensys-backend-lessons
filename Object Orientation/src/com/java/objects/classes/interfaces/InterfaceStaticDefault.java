package com.java.objects.classes.interfaces;
// After JDK 1.8 : we can create static and default methods within interface
interface GovernmentBank {
  public void createAccount();

  public void applyLoan();

  public void withDrawCash();

  static void minAmount() {
    System.out.println("You should credit less than 0");
  }

  default void maxAmount() {
    System.out.println("You should credit more than 2000000");
  }
}

public class InterfaceStaticDefault {
  public static void main(String[] args) {
    
  }
}
