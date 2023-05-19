package com.java.objects.accessmodifier.staticLesson;

import java.util.Scanner;

public class StudentStatic2 {
  
  String name;
  public static String school = "MIT";
  String subject;
  int marks;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the student name:");
    name = scan.nextLine();
    System.out.println("Enter the subject:");
    subject = scan.nextLine();
    System.out.println("Enter the score:");
    marks = scan.nextInt();

    scan.close(); // need to open when running in main again
  }

  public void display() {
    System.out.println("School: " + school + ", Student: " + name + ", Score is: " + marks);
  }

}
