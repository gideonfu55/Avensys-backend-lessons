package com.java.objects;

import java.util.Scanner;

public class sketch {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    //Practice on 3D Arrays - Student Scores of Classes in Colleges:
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
    
    scan.close();

  }
}
