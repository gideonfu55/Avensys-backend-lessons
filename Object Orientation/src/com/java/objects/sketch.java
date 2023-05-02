package com.java.objects;

import java.util.Scanner;

public class sketch {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[][] jaggedArrayBank = new int[5][];
    jaggedArrayBank[0] = new int[3];
    jaggedArrayBank[1] = new int[1];
    jaggedArrayBank[2] = new int[4];
    jaggedArrayBank[3] = new int[5];
    jaggedArrayBank[4] = new int[2];

    // In this case, there may be different sizes of each bank account:
    System.out.println("Enter the account balance of all bank customers:");
    System.out.println();

    for (int i = 0; i < jaggedArrayBank.length; i++) {
      for (int j = 0; j < jaggedArrayBank[i].length; j++) {
        System.out.println("Please enter balance for - Bank " + (i + 1) + ", Customer " + (j + 1) + ":");
        jaggedArrayBank[i][j] = scan.nextInt();
      }
    }

    System.out.println();

    // Printing the account balances of customers:
    for (int i = 0; i < jaggedArrayBank.length; i++) {
      for (int j = 0; j < jaggedArrayBank[i].length; j++) {
        System.out.println("For Bank " + (i + 1) + ", Customer " + (j + 1) + ", the account balance is: $" + jaggedArrayBank[i][j] + ".");
      }
    }
    
    scan.close();

  }
}
