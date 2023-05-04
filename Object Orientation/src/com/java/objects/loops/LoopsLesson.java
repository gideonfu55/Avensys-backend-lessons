package com.java.objects.loops;

import java.util.Scanner;

public class LoopsLesson {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int[] studentAgeArray = new int[10];

    // ============
    // For loops
    // ============
    for (int i = 0; i < studentAgeArray.length; i++) {
      System.out.println("Please enter the age for Student " + (i + 1) + ":");
      studentAgeArray[i] = scan.nextInt();
    }

    System.out.println();

    for (int i = 0; i < studentAgeArray.length; i++) {
      System.out.println("Student " + (i + 1) + "'s age is " + studentAgeArray[i] + ".");
    }

    // ============
    // While loops
    // ============
    int j = 0;
    while (j < studentAgeArray.length) {
      System.out.println("Please enter the age for Student " + (j + 1) + ":");
      studentAgeArray[j] = scan.nextInt();
      j++;
    }

    System.out.println();

    int k = 0;
    while (k < studentAgeArray.length) {
      System.out.println("Student " + (k + 1) + "'s age is " + studentAgeArray[k] + ".");
      k++;
    }

    // ===============
    // do while loops
    // ===============
    int l = 0;
    do {
      System.out.println("Please enter the age for Student " + (l + 1) + ":");
      studentAgeArray[l] = scan.nextInt();
      l++;
    } while (l < studentAgeArray.length);

    System.out.println();

    int m = 0;
    while (m < studentAgeArray.length) {
      System.out.println("Student " + (m + 1) + "'s age is " + studentAgeArray[m] + ".");
      m++;
    }

    scan.close();
  }
}
