package com.java.objects.classes.starters;

public class Fan {
  
  String color;
  String brand;
  int wingNum;

  public Fan(String color, String brand, int wingNum) {
    this.color = color;
    this.brand = brand;
    this.wingNum = wingNum;
  }

  public void rotate() {
    System.out.println("The " + brand + " fan is rotating.");
  }

  public void stop() {
    System.out.println("The " + brand + " fan has stopped.");
  }

  public void blowAir() {
    System.out.println("The " + brand + " fan is blowing air.");
  }
  
}
