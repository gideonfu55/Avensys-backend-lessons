package com.java.objects;

import java.util.Scanner;

public class sketch {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[][][] jaggedArrayBank = new int[3][][];

    // For determining the number of bank branches for each bank:
    jaggedArrayBank[0] = new int[3][];
    jaggedArrayBank[1] = new int[4][];
    jaggedArrayBank[2] = new int[2][];

    // Determining the number of customers in each branch:
    // Bank A:
    jaggedArrayBank[0][0] = new int[4];
    jaggedArrayBank[0][1] = new int[2];
    jaggedArrayBank[0][2] = new int[3];

    // Bank B:
    jaggedArrayBank[1][0] = new int[1];
    jaggedArrayBank[1][1] = new int[2];
    jaggedArrayBank[1][2] = new int[4];
    jaggedArrayBank[1][3] = new int[2];

    // Bank C:
    jaggedArrayBank[2][0] = new int[5];
    jaggedArrayBank[2][1] = new int[2];

    // In this case, there are different sizes of each bank account:
    System.out.println("Enter the account balance of all bank customers:");
    System.out.println();

    for (int i = 0; i < jaggedArrayBank.length; i++) {
      for (int j = 0; j < jaggedArrayBank[i].length; j++) {
        for (int k = 0; k < jaggedArrayBank[i][j].length; k++) {
          System.out.println(
            "Please enter balance for - Bank " + (i + 1) + 
            ", Branch " + (j + 1) + 
            ", Customer " + (k + 1) + 
            ":"
          );
          jaggedArrayBank[i][j][k] = scan.nextInt();
        }

      }
    }

    System.out.println();

    // Printing the account balances of customers:
    for (int i = 0; i < jaggedArrayBank.length; i++) {
      for (int j = 0; j < jaggedArrayBank[i].length; j++) {
        for (int k = 0; k < jaggedArrayBank[i][j].length; k++) {
          System.out.println(
            "For Bank " + (i + 1) + 
            ", Branch " + (j + 1) +
            ", Customer " + (k + 1) + 
            ", the account balance is: $" + jaggedArrayBank[i][j][k] + "."
          );
        }
      }
    }
    
    scan.close();

  }
}
