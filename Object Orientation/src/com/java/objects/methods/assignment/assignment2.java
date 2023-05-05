package com.java.objects.methods.assignment;

import java.util.Scanner;

public class assignment2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the name to check for 's':");
    String name = scan.nextLine();

    boolean result = checkName(name);

    System.out.println();

    if (result == true) {
      System.out.println("The name contains an 's'.");
    } else {
      System.out.println("The name does not contains an 's'.");
    }

    scan.close();
  }

  public static boolean checkName(String a) {
    char[] ch = a.toLowerCase().toCharArray();
    
    for (char c : ch) {
      if (c == 's') {
        return true;
      }
    }
    return false;
  }
}
