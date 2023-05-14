package com.java.objects.classes.starters;

public class FanTwo {

  private int amount;

  // Getters:
  public int getAmount() {
    return this.amount;
  }

  // Setters:
  public void setAmount(int amount) {
    if (amount > 0) {
      this.amount = amount;
    } else {
      System.out.println("Please set a fan amount > 0");
    }
  }
}
