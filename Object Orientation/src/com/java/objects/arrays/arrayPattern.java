package com.java.objects.arrays;

import java.util.Scanner;

public class arrayPattern {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
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

    scan.close();
  }
}
