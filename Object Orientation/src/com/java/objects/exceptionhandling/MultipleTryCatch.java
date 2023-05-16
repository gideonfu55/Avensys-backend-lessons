package com.java.objects.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      // Example 1:
      System.out.println("Enter the numerator:");
      int a = scan.nextInt();

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
    } 

    catch (ArithmeticException ae) {
      System.out.println("Hi user, please do not provide a 0 as denominator.");
    }

    catch (NegativeArraySizeException ne) {
      System.out.println("Hi user, please provide a positive value to array size.");
    }

    catch (InputMismatchException ie) {
      System.out.println("Hi user, please pass a valid input type.");
    }

    catch (ArrayIndexOutOfBoundsException aie) {
      System.out.println("Hi user, please provide a valid array position.");
    }

    catch (Exception e) {
      System.out.println("An error occurred.");
    }

    finally {
      System.out.println("Connection is closed.");
    }

    scan.close();
  }
}
