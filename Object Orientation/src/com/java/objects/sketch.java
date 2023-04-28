package com.java.objects;

import java.util.Scanner;

public class sketch {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int bankBalance[][] = new int[5][3];

    // Getting the scores of 3 customers in 5 banks:
    System.out.println("Enter the account balances of all customers:");
    System.out.println();

    for (int i = 0; i < bankBalance.length; i++) {
      for (int j = 0; j < bankBalance[i].length; j++) {
        System.out.println("Please enter the balance for - Bank " + (i + 1) + ", Customer " + (j + 1) + ":");
        bankBalance[i][j] = scan.nextInt();
      }
    }

    System.out.println();

    // Printing the bank balances of all customers:
    for (int i = 0; i < bankBalance.length; i++) {
      for (int j = 0; j < bankBalance[i].length; j++) {
        System.out.println("For Bank " + (i + 1) + ", Customer " + (j + 1) + ", the balance is: $" + bankBalance[i][j] + ".");
      }
    }
    
    scan.close();

  }
}
