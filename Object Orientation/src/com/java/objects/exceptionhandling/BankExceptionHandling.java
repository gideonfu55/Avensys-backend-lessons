package com.java.objects.exceptionhandling;
import java.util.Scanner;

// Custom Exception Handling:
class InvalidInputException extends Exception {
  public String getMessage() {
    return "Invalid entry.";
  }
}

class ATMTwo {
  int userAccNum = 1111;
  String userPassword = "0123";
  int accInput;
  String pwInput;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the account number");
    accInput = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter the password");
    pwInput = scan.nextLine();

    scan.close(); // need to open when running in main again
  }

  public void verify() throws InvalidInputException {
    if (userAccNum == accInput && userPassword.equals(pwInput)) {
      System.out.println("Account holder verified. Please select your banking service options.");
    } else {
      InvalidInputException ie = new InvalidInputException();
      throw ie;
    }
  }
}

class Bank {
  public void initiate() {
    ATMTwo atm = new ATMTwo();
    boolean repeatTransaction = true;
    int tryCounts = 3;
    while (repeatTransaction) {
      try {
        atm.acceptInput();
        atm.verify();
        repeatTransaction = false;
      } catch (Exception e) {
        System.out.println("Invalid input. You have " + (tryCounts - 1) + " more chance(s) to enter correct details.");
        tryCounts--;
        if (tryCounts == 0) {
          System.out.println("\nYou have reached the limit for incorrect pin attempts. This ATM card has been deactivated. Please contact the bank.");
          break;
        }
      }
    }
  }
}

public class BankExceptionHandling {
  public static void main(String[] args) {
    Bank bank1 = new Bank();
    bank1.initiate();
  }
}
