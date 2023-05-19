package com.java.objects.classes.interfaces;

import java.util.Scanner;

interface Calculator {
  public void multiply();
  public void divide();
}

class MyCal1 implements Calculator {

  public void multiply() {
    int a = 10;
    int b = 20;
    int c = a * b;
    System.out.println(c);
  }

  public void divide() {
    int a = 10;
    int b = 5;
    int c = a / b;
    System.out.println(c);
  }
}

class MyCal2 implements Calculator {

  public void multiply() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = a * b;
    System.out.println(c);

    scan.close(); // need to open when running in main again
  }

  public void divide() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = a / b;
    System.out.println(c);

    scan.close(); // need to open when running in main again
  }
}

class MyCal3 implements Calculator {

  public void multiply() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c;
    if (a == 0 || b == 0) {
      c = 0;
    } else {
      c = a * b;
    }

    System.out.println(c);

    scan.close(); // need to open when running in main again
  }

  public void divide() {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = 0;
    if (a == 0 || b == 0) {
      System.out.println("Please provide non-zero integers.");
      ;
    } else {
      c = a / b;
    }

    System.out.println(c);

    scan.close(); // need to open when running in main again
  }
}

class MathOperation {
  public void acceptCalculator(Calculator ref) {
    ref.multiply();
    ref.divide();
  }
}

public class InterfaceLesson extends Object {
  public static void main(String[] args) {
    MyCal1 mc1 = new MyCal1();
    MyCal2 mc2 = new MyCal2();
    MyCal3 mc3 = new MyCal3();

    MathOperation mathOp1 = new MathOperation();
    mathOp1.acceptCalculator(mc1);
    mathOp1.acceptCalculator(mc2);
    mathOp1.acceptCalculator(mc3);
  }
}
