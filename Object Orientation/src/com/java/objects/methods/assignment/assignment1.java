package com.java.objects.methods.assignment;

import java.util.Scanner;

public class assignment1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter first name to check:");
    String name1 = scan.nextLine();

    System.out.println("Please enter second name to check:");
    String name2 = scan.nextLine();

    String result = checkStrings(name1, name2);

    System.out.println();

    if (result == "greater") {
      System.out.println("The first name is greater than second name.");
    } else if (result == "lesser") {
      System.out.println("The second name is greater than first name.");
    } else {
      System.out.println("The names are equal.");
    }

    scan.close();
  }

  public static boolean checkEqual(String a, String b) {
    boolean result = (a.equalsIgnoreCase(b)) ? true : false;
    return result;
  }

  public static String checkStrings(String a, String b) {
    if (checkEqual(a, b) == true) {
      return "equal";
    }
    String result = (a.compareTo(b) > 0) ? "greater" : "lesser";
    return result;
  }
}
