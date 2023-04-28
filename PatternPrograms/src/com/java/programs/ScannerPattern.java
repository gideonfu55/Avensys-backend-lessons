package com.java.programs;

import java.util.Scanner;

public class ScannerPattern {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Exercise D - Square Box
    /**
     * Output:
     * * * * * *
     * *       *
     * *       *
     * *       *
     * * * * * *
     * 
     */

    System.out.println("Enter number of rows for printing a square:");
    int n = scanner.nextInt();

    System.out.println("");
    System.out.println("Here is your pattern:");

    // Method 1:
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= n; j++) {

    //     if (i == 1 || i == n || j == 1 || j == n) {
    //       System.out.print("*");
    //     } else {
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

    // Method 2:
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {

        if (i >= 2 && j >= 2 && i <= n - 1 && j <= n - 1) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }

    System.out.println("");

    System.out.println("Enter number of rows for printing a triangle:");
    int p = scanner.nextInt();

    System.out.println("");
    System.out.println("Here is your pattern:");

    for (int i = 1; i <= p; i++) {
      for (int j = p - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        if (i == p || i == k || k == 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    

    scanner.close();
  
  }

}
