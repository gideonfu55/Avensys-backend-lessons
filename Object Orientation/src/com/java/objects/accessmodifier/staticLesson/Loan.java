package com.java.objects.accessmodifier.staticLesson;

import java.util.Scanner;

public class Loan {
  int principle;
  int time;
  public static float interestRate = 2f;
  float simpleInterest;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the principle amount:");
    principle = scan.nextInt();
    System.out.println("Enter the time:");
    time = scan.nextInt();

    scan.close(); // need to open when running in main again
  }

  public void findSI() {
    simpleInterest = (principle * time * interestRate) / 100;
  }

  public void display() {
    System.out.println();
    System.out.println("Simple interest is: " + simpleInterest);
  }
}
