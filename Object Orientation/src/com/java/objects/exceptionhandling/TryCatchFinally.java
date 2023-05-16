package com.java.objects.exceptionhandling;

import java.util.Scanner;

public class TryCatchFinally {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // By using a try-catch block, I ensure that there is a net to catch the arithmetic exception if it happens, and redirect the outcome to what I want (e.g. a message, or another code block.)
    // - As such, the crash does not occur in this case.
    try {
      System.out.println("Connection Established");

      System.out.println("Enter the numerator:");
      int a = scan.nextInt();

      System.out.println("Enter the denominator:");
      int b = scan.nextInt();

      int c = a / b;
      System.out.println("Result of the operation: " + c);
    }

    catch (Exception e) {
      System.out.println("Some problem occurred.");
    }

    finally {
      System.out.println("Connection is closed.");
    }

    scan.close();
  }
}
