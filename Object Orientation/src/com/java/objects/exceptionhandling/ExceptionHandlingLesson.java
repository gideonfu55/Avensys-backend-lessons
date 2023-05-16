package com.java.objects.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingLesson {
  public static void main(String[] args) {
    System.out.println("Connection Established");

    Scanner scan = new Scanner(System.in);

    // Example 1:
    System.out.println("Enter the numerator:");
    int a = scan.nextInt();
    
    // Arithmetic Exception occurs if zero is placed:
    // - Problem: it leads to a application crash that's abrupt and uncontrolled.
    System.out.println("Enter the denominator:");
    int b = scan.nextInt();

    int c = a / b;
    System.out.println("Result of the operation: " + c);

    // Example 2:
    System.out.println("Enter the array length:");
    int length = scan.nextInt();

    int[] arr = new int[length];

    System.out.println("Enter the element you wish to store in the array:");
    int element = scan.nextInt();

    System.out.println("Enter the position:");
    int position = scan.nextInt();

    arr[position] = element;

    System.out.println("The element " + element + " is present in " + position + " position of array.");

    System.out.println("Connection is closed.");
    scan.close();
  }
}
