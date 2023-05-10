package com.java.objects.classes;

import java.util.Scanner;

public class Loan {
  int principle;
  int time;
  float interestRate;
  float simpleInterest;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the principle amount");
    principle = scan.nextInt();
    System.out.println("Enter the time");
    System.out.println();
    time = scan.nextInt();
    interestRate = 2f;

    scan.close();
  }

  public void findSI() {
    simpleInterest = (principle * time * interestRate) / 100;
  }

  public void display() {
    System.out.println("Simple interest is:" + simpleInterest);
  }
}
