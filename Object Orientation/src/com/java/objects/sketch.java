package com.java.objects;

import java.util.Scanner;

public class sketch {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // Creating 3D Jagged Array for student scores - 3 colleges:
    int[][][] jaggedArrayScores2 = new int[3][][];

    // For determining the number of classes for each college:
    jaggedArrayScores2[0] = new int[3][];
    jaggedArrayScores2[1] = new int[2][];
    jaggedArrayScores2[2] = new int[4][];

    // Determining the number of students in each class:
    // College A:
    jaggedArrayScores2[0][0] = new int[3];
    jaggedArrayScores2[0][1] = new int[2];
    jaggedArrayScores2[0][2] = new int[4];

    // College B:
    jaggedArrayScores2[1][0] = new int[5];
    jaggedArrayScores2[1][1] = new int[3];

    // College C:
    jaggedArrayScores2[2][0] = new int[1];
    jaggedArrayScores2[2][1] = new int[4];
    jaggedArrayScores2[2][2] = new int[2];
    jaggedArrayScores2[2][3] = new int[3];

    System.out.println("Enter the scores of all students:");
    System.out.println();

    for (int i = 0; i < jaggedArrayScores2.length; i++) {
      for (int j = 0; j < jaggedArrayScores2[i].length; j++) {
        for (int k = 0; k < jaggedArrayScores2[i][j].length; k++) {
          System.out.println(
            "Please enter balance for - College " + (i + 1) + 
            ", Class " + (j + 1) +
            ", Student " + (k + 1) +
            ":"
          );
          jaggedArrayScores2[i][j][k] = scan.nextInt();
        }

      }
    }

    System.out.println();

    // Printing the account balances of customers:
    for (int i = 0; i < jaggedArrayScores2.length; i++) {
      for (int j = 0; j < jaggedArrayScores2[i].length; j++) {
        for (int k = 0; k < jaggedArrayScores2[i][j].length; k++) {
          System.out.println(
            "For College " + (i + 1) + 
            ", Class " + (j + 1) +
            ", Student " + (k + 1) + 
            ", the score is: " + jaggedArrayScores2[i][j][k] + "."
          );
        }
      }
    }
    
    scan.close();

  }
}
