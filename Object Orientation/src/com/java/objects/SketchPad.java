package com.java.objects;

import java.util.Scanner;

public class SketchPad {
  public static void main(String[] args) {

    // Write program to take the name as input and check whether the name contains 's' or not.
    // Solution:
    // 1. Create method check() which should accept a String name as the parameter
    // 2. It should return a boolean value.

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter name to check:");
    String name = scan.nextLine();

    boolean result = checkName(name);

    if (result == true) {
      System.out.println("The name you entered contains \"s\".");
    } else {
      System.out.println("The name you entered does not contains \"s\".");
    }

    scan.close();

  }

  public static boolean checkName(String name) {
    boolean result = (name.toLowerCase().contains("s")) ? true : false;
    return result;
  }
}
