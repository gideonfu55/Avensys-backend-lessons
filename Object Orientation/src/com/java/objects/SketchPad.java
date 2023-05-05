package com.java.objects;

import java.util.Scanner;

public class SketchPad {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter first name to check:");
    String name = scan.nextLine();

    System.out.println("Please enter second name to check:");
    String name2 = scan.nextLine();

    boolean result2 = checkStrings(name2, name);

    System.out.println();

    if (result2 == true) {
    System.out.println("The 2 names entered are equal.");
    } else {
    System.out.println("The 2 names entered are not equal.");
    }

    scan.close();
  }

  public static boolean checkStrings(String a, String b) {
    boolean result = (a.toLowerCase().equals(b.toLowerCase())) ? true : false;
    return result;
  }
}
