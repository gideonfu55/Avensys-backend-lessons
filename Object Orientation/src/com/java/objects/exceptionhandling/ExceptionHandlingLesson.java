package com.java.objects.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingLesson {
  public static void main(String[] args) {
    System.out.println("Connection Established");

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numerator:");
    int a = scan.nextInt();
    
    System.out.println("Enter the denominator:");
    int b = scan.nextInt();

    int c = a / b;
    System.out.println("Result of the operation: " + c);

    System.out.println("Connection is closed.");
    scan.close();
  }
}
