package com.java.objects.classes.interfaces;
import java.util.Scanner;

interface CalculateInterest {
  public void acceptInput();
  public void findSimpleInterest();
  public void display();
}

class businessMan1 implements CalculateInterest {

  int loanAmount = 1000;
  int interestRate = 2;
  int paymentPeriod = 2;
  int simpleInterest = 0;

  public void acceptInput() {
    System.out.println("This is a fixed loan.");
  }

  public void findSimpleInterest() {
    simpleInterest = loanAmount * interestRate / 100 / paymentPeriod;
    System.out.println(simpleInterest);
  }

  public void display() {
    System.out.println("The simple interest for the loan per annum is: $" + simpleInterest);
  }

}

class businessMan2 implements CalculateInterest {

  int loanAmount = 0;
  int interestRate = 3;
  int paymentPeriod = 0;
  int simpleInterest = 0;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please provide your required loan amount:");
    loanAmount = scan.nextInt();
    System.out.println("Please provide the intended payment period:");
    paymentPeriod = scan.nextInt();
    System.out.println("Your loan amount is: $" + loanAmount + " over " + paymentPeriod + " year(s).");
  }

  public void findSimpleInterest() {
    simpleInterest = loanAmount * interestRate / 100 / paymentPeriod;
    System.out.println(simpleInterest);
  }

  public void display() {
    System.out.println("The simple interest for the loan per annum is: $" + simpleInterest);
  }

}

class businessMan3 implements CalculateInterest {
  int loanAmount = 0;
  int interestRate = 4;
  int paymentPeriod = 0;
  int simpleInterest = 0;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please provide your required loan amount:");
    loanAmount = scan.nextInt();
    System.out.println("Please provide the intended payment period:");
    paymentPeriod = scan.nextInt();

    if (loanAmount <= 0 || paymentPeriod <= 0) {
      System.out.println("Please enter a valid loan amount and payment period > 0.");
      loanAmount = 0;
      paymentPeriod = 0;
    } else {
      System.out.println("Your loan amount is: $" + loanAmount + " over " + paymentPeriod + " year(s).");
    }
  }

  public void findSimpleInterest() {
    if (loanAmount == 0 || paymentPeriod == 0) {
      System.out.println("There is no valid loan amount and/or payment period.");
    } else {
      simpleInterest = loanAmount * interestRate / 100 / paymentPeriod;
      System.out.println(simpleInterest);
    }
  }

  public void display() {
    System.out.println("The simple interest for the loan per annum is: $" + simpleInterest);
  }

}

class BankTwo {
  public void acceptCalculateInterest(CalculateInterest ref) {
    ref.acceptInput();
    ref.findSimpleInterest();
    ref.display();
  }
}

public class SimpleInterestInterface {
  public static void main(String[] args) {
    businessMan1 b1 = new businessMan1();
    businessMan2 b2 = new businessMan2();
    businessMan3 b3 = new businessMan3();

    BankTwo bankNew = new BankTwo();
    System.out.println("Business Man 1: ");
    System.out.println("===============");
    bankNew.acceptCalculateInterest(b1);

    System.out.println("\nBusiness Man 2: ");
    System.out.println("===============");
    bankNew.acceptCalculateInterest(b2);

    System.out.println("\nBusiness Man 3: ");
    System.out.println("===============");
    bankNew.acceptCalculateInterest(b3);
  }
}
