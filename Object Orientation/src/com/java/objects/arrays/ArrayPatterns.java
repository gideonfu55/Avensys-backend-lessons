package com.java.objects.arrays;

import java.util.Scanner;

public class ArrayPatterns {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    /**
     * Array Pattern Problems:
     * 
     * Example 1:
     * 
     * Get the reverse copy of an array:
     */

    System.out.println("Enter the length of the array:");
    int len = scan.nextInt();

    int[] a = new int[len];

    System.out.println("Array is created with the size of " + len);

    System.out.println("Please enter the " + len + " elements:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }

    System.out.println();
    System.out.println("1st array elements are:");

    for (int j = 0; j < a.length; j++) {
      System.out.print(a[j] + " ");
    }

    System.out.println();

    // Create 2nd array:
    int[] b = new int[a.length];

    // Copying a to b array:
    // for (int i = 0; i < a.length; i++) {
    // b[i] = a[i];
    // }

    // Copy a to b array in reverse order:
    for (int i = 0; i < a.length; i++) {
      b[i] = a[a.length - i - 1];
    }

    System.out.println();

    // Printing 2nd Array Elements:
    System.out.println("2nd Array Elements are:");
    for (int j = 0; j < b.length; j++) {
      System.out.print(b[j] + " ");
    }

    /**
     * Example 2:
     * 
     * Find index of value(s) in an array:
     */

    System.out.println("\nEnter the length of the array:");
    int len2 = scan.nextInt();

    int[] c = new int[len2];

    System.out.println("Array A has been created with the size of " + len2);

    System.out.println();

    System.out.println("Please enter the " + len2 + " elements:");
    for (int i = 0; i < c.length; i++) {
      c[i] = scan.nextInt();
    }

    System.out.println();
    System.out.println("Array A elements are:");

    for (int j = 0; j < a.length; j++) {
      System.out.print(c[j] + " ");
    }

    System.out.println("\n");

    System.out.println("Enter the value you wish to find in Array A to print its index:");

    int d = scan.nextInt();

    System.out.println();

    String[] ref = new String[c.length];

    // for (int i = 0; i < a.length; i++) {
    // if (a[i] == b) {
    // System.out.println("The index found for this value is " + i);
    // } else {
    // System.out.println("The key is not found in " + i);
    // }
    // }

    for (int i = 0; i < a.length; i++) {
      if (c[i] == d) {
        ref[i] = Integer.toString(i);
      }
    }

    int count = 0;
    for (String letter : ref) {
      if (letter == null) {
        count++;
      }
    }

    if (count == c.length) {
      System.out.println("The value can't be found in Array A.");
    } else {
      System.out.print("The index(es) matched to the value of " + d + " in Array A: \n");
      for (String letter : ref) {
        if (letter != null) {
          System.out.print(letter + ", ");
        }
      }
    }

    scan.close();
  }
}
