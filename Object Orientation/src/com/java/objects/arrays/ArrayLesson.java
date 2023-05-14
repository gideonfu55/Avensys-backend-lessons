package com.java.objects.arrays;

import java.util.Scanner;

public class ArrayLesson {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int[] studentScoreArray = new int[5];

    /*
     * System.out.println("Please enter the first student's marks:");
     * int studentA = scan.nextInt();
     * 
     * System.out.println("Please enter the second student's marks:");
     * int studentB = scan.nextInt();
     * 
     * System.out.println("Please enter the third student's marks:");
     * int studentC = scan.nextInt();
     * 
     * System.out.println("Please enter the fourth student's marks:");
     * int studentD = scan.nextInt();
     * 
     * System.out.println("Please enter the fifth student's marks:");
     * int studentE = scan.nextInt();
     * 
     * studentScoreArray[0] = studentA;
     * studentScoreArray[1] = studentB;
     * studentScoreArray[2] = studentC;
     * studentScoreArray[3] = studentD;
     * studentScoreArray[4] = studentE;
     */

    // Rather than enter the question repetitively, you should use a loop.
    for (int i = 0; i < studentScoreArray.length; i++) {
      System.out.println("Please enter the score for Student " + (i + 1) + ":");
      studentScoreArray[i] = scan.nextInt();
    }

    System.out.println();

    for (int i = 0; i < studentScoreArray.length; i++ ) {
      System.out.println("Student " + (i + 1) + "'s score is " + studentScoreArray[i] + ".");
    }

    // Creating 2D to 3D Arrays:
    int[] a = new int[5]; // 1D

    // Think of 2D Arrays in this way (example if you are trying to store student score for 5 classes with 3 students each):
    /*
     * 
     * | Class | Score 1 | Score 2 | Score 3 |
     * |-------|---------|---------|---------|
     * |   0   |   72    |   74    |   78    |
     * |   1   |   65    |   64    |   61    |
     * |   3   |   95    |   98    |   99    |
     * |   4   |   60    |   76    |   80    |
     * ---------------------------------------
     * 
     */

    int[][] b = new int[5][3]; // 2D

    // 3D Arrays cannot be represented here graphically, but it is seldom used actually.
    int[][][] c = new int[5][3][2]; // 3D

    System.out.println(a.length); // output: 5
    System.out.println(b[0].length); // output: 3
    System.out.println(c[0][0].length); // output: 2

    // More practice on 2D arrays:
    int d[][] = new int[5][6];

    // Getting the scores of 6 students in 5 classes:
    System.out.println("Enter the marks of all students:");
    System.out.println();
    
    for (int i = 0; i < d.length; i++) {
      for (int j = 0; j < d[i].length; j++) {
        System.out.println("Please enter score for - Class " + (i + 1) + ", Student " + (j + 1) + ":");
        d[i][j] = scan.nextInt();
      }
    }

    System.out.println();

    // Printing the scores of students:
    for (int i = 0; i < d.length; i++) {
      for (int j = 0; j < d[i].length; j++) {
        System.out.println("For Class " +( i + 1) + ", Student " + (j + 1) + ", the score is: " + d[i][j] + ".");
      }
    }

    // Bank Example:
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
        System.out
            .println("For Bank " + (i + 1) + ", Customer " + (j + 1) + ", the balance is: $" + bankBalance[i][j] + ".");
      }
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // There a 2D Jagged array too - the columns are of different sizes
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    int[][] jaggedArray = new int[4][];
    jaggedArray[0] = new int[3];
    jaggedArray[1] = new int[4];
    jaggedArray[2] = new int[1];
    jaggedArray[3] = new int[2];

    // In this case, there may be different sizes of each class:
    System.out.println("Enter the marks of all students:");
    System.out.println();

    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.println("Please enter score for - Class " + (i + 1) + ", Student " + (j + 1) + ":");
        jaggedArray[i][j] = scan.nextInt();
      }
    }

    System.out.println();

    // Printing the scores of students:
    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.println("For Class " + (i + 1) + ", Student " + (j + 1) + ", the score is: " + jaggedArray[i][j] + ".");
      }
    }

    // ++++++++++++++++++++++++++++++++
    // Bank account example - 2D Array:
    // ++++++++++++++++++++++++++++++++

    int[][] jaggedArrayBank = new int[5][];

    jaggedArrayBank[0] = new int[3];
    jaggedArrayBank[1] = new int[1];
    jaggedArrayBank[2] = new int[4];
    jaggedArrayBank[3] = new int[5];
    jaggedArrayBank[4] = new int[2];

    // In this case, there are different sizes of each bank account:
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
        System.out.println("For Bank " + (i + 1) + ", Customer " + (j + 1) + ", the account balance is: $"
            + jaggedArrayBank[i][j] + ".");
      }
    }

    // +++++++++++++++++
    // 3D Array Examples
    // +++++++++++++++++

    // 1. Practice on 3D Arrays - Student Scores of Classes in Colleges:
    int collegeStudentScores[][][] = new int[3][3][4];

    // Getting the scores of 6 students in 5 classes:
    System.out.println("Enter the marks of all students:");
    System.out.println();

    for (int i = 0; i < collegeStudentScores.length; i++) {
      for (int j = 0; j < collegeStudentScores[i].length; j++) {
        for (int k = 0; k < collegeStudentScores[i][j].length; k++) {
          System.out.println(
              "Please enter score for - College " + (i + 1) +
                  ", Class " + (j + 1) +
                  ", Student " + (k + 1) + ":");
          collegeStudentScores[i][j][k] = scan.nextInt();
        }
      }
    }

    System.out.println();

    // Printing the scores of students:
    for (int i = 0; i < collegeStudentScores.length; i++) {
      for (int j = 0; j < collegeStudentScores[i].length; j++) {
        for (int k = 0; k < collegeStudentScores[i][j].length; k++) {
          System.out.println(
              "For College " + (i + 1) +
                  ", Class " + (j + 1) +
                  ", Student " + (k + 1) + ", the score is: " + collegeStudentScores[i][j][k] + ".");
        }
      }
    }

    int[][][] jaggedArrayBank2 = new int[3][][];

    // For determining the number of bank branches for each bank:
    jaggedArrayBank2[0] = new int[3][];
    jaggedArrayBank2[1] = new int[4][];
    jaggedArrayBank2[2] = new int[2][];

    // Determining the number of customers in each branch:
    // Bank A:
    jaggedArrayBank2[0][0] = new int[4];
    jaggedArrayBank2[0][1] = new int[2];
    jaggedArrayBank2[0][2] = new int[3];

    // Bank B:
    jaggedArrayBank2[1][0] = new int[1];
    jaggedArrayBank2[1][1] = new int[2];
    jaggedArrayBank2[1][2] = new int[4];
    jaggedArrayBank2[1][3] = new int[2];

    // Bank C:
    jaggedArrayBank2[2][0] = new int[5];
    jaggedArrayBank2[2][1] = new int[2];

    // In this case, there are different sizes of each bank account:
    System.out.println("Enter the account balance of all bank customers:");
    System.out.println();

    for (int i = 0; i < jaggedArrayBank2.length; i++) {
      for (int j = 0; j < jaggedArrayBank2[i].length; j++) {
        for (int k = 0; k < jaggedArrayBank2[i][j].length; k++) {
          System.out.println(
              "Please enter balance for - Bank " + (i + 1) +
                  ", Branch " + (j + 1) +
                  ", Customer " + (k + 1) +
                  ":");
          jaggedArrayBank2[i][j][k] = scan.nextInt();
        }

      }
    }

    System.out.println();

    // Printing the account balances of customers:
    for (int i = 0; i < jaggedArrayBank2.length; i++) {
      for (int j = 0; j < jaggedArrayBank2[i].length; j++) {
        for (int k = 0; k < jaggedArrayBank2[i][j].length; k++) {
          System.out.println(
              "For Bank " + (i + 1) +
                  ", Branch " + (j + 1) +
                  ", Customer " + (k + 1) +
                  ", the account balance is: $" + jaggedArrayBank2[i][j][k] + ".");
        }
      }
    }

    // 2. Student Scores - 3D Jagged Array Example:
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
              "Enter score for - College " + (i + 1) +
                  ", Class " + (j + 1) +
                  ", Student " + (k + 1) +
                  ":");
          jaggedArrayScores2[i][j][k] = scan.nextInt();
        }

      }
    }

    System.out.println();

    // Printing the scores of all students:
    for (int i = 0; i < jaggedArrayScores2.length; i++) {
      for (int j = 0; j < jaggedArrayScores2[i].length; j++) {
        for (int k = 0; k < jaggedArrayScores2[i][j].length; k++) {
          System.out.println(
              "For College " + (i + 1) +
                  ", Class " + (j + 1) +
                  ", Student " + (k + 1) +
                  ", the score is: " + jaggedArrayScores2[i][j][k] + ".");
        }
      }
    }

    scan.close();
  }
}
