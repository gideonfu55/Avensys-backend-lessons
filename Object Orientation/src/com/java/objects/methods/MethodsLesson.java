package com.java.objects.methods;

import java.util.Scanner;

import com.java.objects.methods.overloading.Calculator;

public class MethodsLesson {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Calculator myCal = new Calculator();

    myCal.add();
    myCal.subtract(20, 30);

    int resultMultiple = myCal.multiply();
    int resultDivide = myCal.divide('a', 20);

    System.out.println(resultMultiple);
    System.out.println(resultDivide);

    /*
     * In class assignment:
     * Write program to take the name as input and check whether the name
     * contains 's' or not.
     * 
     * Solution:
     * 1. Create method check() which should accept a String name as the
     * parameter
     * 2. It should return a boolean value.
     * 
     */

    // 1.
    System.out.println("Please enter name to check:");
    String name = scan.nextLine();

    boolean result = checkName(name);

    if (result == true) {
    System.out.println("The name you entered contains \"s\".");
    } else {
    System.out.println("The name you entered does not contains \"s\".");
    }

    // String name checker assignment:
    System.out.println("Please enter first name to check:");
    String name2 = scan.nextLine();

    System.out.println("Please enter second name to check:");
    String name3 = scan.nextLine();

    boolean result2 = checkStrings(name2, name3);

    System.out.println();

    if (result2 == true) {
      System.out.println("The 2 names entered are equal.");
    } else {
      System.out.println("The 2 names entered are not equal.");
    }

    scan.close();
  }

  public static boolean checkName(String name) {
    boolean result = (name.toLowerCase().contains("s")) ? true : false;
    return result;
  }

  public static boolean checkStrings(String a, String b) {
    boolean result = (a.equalsIgnoreCase(b)) ? true : false;
    return result;
  }
}
