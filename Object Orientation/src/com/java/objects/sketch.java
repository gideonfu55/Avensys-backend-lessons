package com.java.objects;

import java.util.Scanner;

public class sketch {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the length of the array:");
    int len = scan.nextInt();

    int[] a = new int[len];

    System.out.println("Array A has been created with the size of " + len);

    System.out.println();
    
    System.out.println("Please enter the " + len + " elements:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }

    System.out.println();
    System.out.println("Array A elements are:");

    for (int j = 0; j < a.length; j++) {
      System.out.print(a[j] + " ");
    }

    System.out.println("\n");

    System.out.println("Enter the value you wish to find in Array A to print its index:");

    int b = scan.nextInt();

    System.out.println();

    String[] ref = new String[a.length];

    // for (int i = 0; i < a.length; i++) {
    //   if (a[i] == b) {
    //     System.out.println("The index found for this value is " + i);
    //   } else {
    //     System.out.println("The key is not found in " + i);
    //   }
    // }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == b) {
        ref[i] = Integer.toString(i);
      }
    }

    int count = 0;
    for (String letter : ref) {
      if (letter == null) {
        count++;
      }
    }

    if (count == a.length) {
      System.out.println("The value can't be found in Array A.");
    } else {
      System.out.print("The index(es) matched to the value of " + b + " in Array A: ");
      for (String letter : ref) {
        if (letter != null) {
          System.out.println(letter + ", ");
        }
      }
    }

    scan.close();

  }
}
