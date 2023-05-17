package com.java.objects.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
  public static int divide (int a, int b) {
    return a / b;
  }
}

public class MultipleTryCatchTwo {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    try {
      // Example A:
      System.out.println("Enter the first number:");
      int num1 = scan.nextInt();

      System.out.println("Enter the second number:");
      int num2 = scan.nextInt();

      int c = Calculator.divide(num1, num2);

      System.out.println("The result of the division is: " + c);

      // Example B:
      System.out.println("Enter the array length:");
      int length = scan.nextInt();

      int[] arrayA = new int[length];

      System.out.println("Enter the element you wish to store in the array:");
      int element = scan.nextInt();

      System.out.println("Enter the position:");
      int position = scan.nextInt();

      arrayA[position] = element;

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
