package com.java.objects.accessmodifier.staticLesson;

public class FanStatic {

  static int price, bladeNum, size;

  static {
    price = 30;
    bladeNum = 4;
    size = 10;
  }

  public static void displayOne() {
    System.out.println("The price is: $" + price);
    System.out.println("The number of blades is: " + bladeNum);
    System.out.println("The size is: " + size + " kg.");
    // System.out.println("Fan speed: " + speed);
  }

  int year, buttons, speed;

  {
    price = 100;
    bladeNum = 5;
    size = 5;
    year = 2023;
    buttons = 3;
    speed = 10;
  }

  public void displayTwo() {
    System.out.println("The price is: $" + price);
    System.out.println("The number of blades is: " + bladeNum);
    System.out.println("The size is: " + size + " kg.");
    System.out.println("The year made is: " + year);
    System.out.println("The number of buttons: " + buttons);
    System.out.println("Fan speed: " + speed);
  }
}
