package com.java.objects.exceptionhandling.assignment;
import java.util.Scanner;

// Custom exception:
class OverAgeException extends Exception {
  public String getMessage() {
    return "Your age is above 45 and beyond the age limit for this app.";
  }
}

class UnderAgeException extends Exception {
  public String getMessage() {
    return "Your age is under 18 and below the age limit for this app.";
  }
}

class MatchFinderApp {
  String username;
  int ageInput;
  int overageLimit = 45;
  int underageLimit = 18;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    username = scan.nextLine();
    System.out.println("Please enter your age: ");
    ageInput = scan.nextInt();

    scan.close(); // need to open when running in main again
  }

  public void verify() throws OverAgeException, UnderAgeException{
    if (ageInput >= underageLimit && ageInput <= overageLimit) {
      System.out.println("Thank you. Please proceed with our match finder services!");
    } else if (ageInput < underageLimit) {
      UnderAgeException uae = new UnderAgeException();
      throw uae;
    } else {
      OverAgeException oae = new OverAgeException();
      throw oae;
    }
  }
}

class SocialSpace {
  public void join() {
    MatchFinderApp newApp1 = new MatchFinderApp();
    try {
      newApp1.acceptInput();
      newApp1.verify();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

public class MatchFindingApp {
  public static void main(String[] args) {
    SocialSpace newSS = new SocialSpace();
    newSS.join();
  }
}


