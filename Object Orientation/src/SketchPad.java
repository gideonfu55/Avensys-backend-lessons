import java.util.Scanner;

class ATM {
  public void alpha() {
    try {
      System.out.println("Connection 1 is established.");
      transaction();
      System.out.println("Connection 1 is closed.");

    } catch (Error e) {
      System.out.println("A problem occurred during the input.");
      throw e;

    } finally {
      System.out.println("Connection 1 is Closed");
    }
  }

  public void transaction() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numerator");
    int a = scan.nextInt();
    System.out.println("Enter the denominator");
    int b = scan.nextInt();
    int c = a / b;
    System.out.println("Result is: " + c);
  }
}

class SketchPad {
  public static void main(String[] args) {
    System.out.println("Main connection is established.");
    ATM atm1 = new ATM();
    try {
      atm1.alpha();
    } catch (Exception e) {
      System.out.println("Exception is handled in main method now.");
      atm1.transaction();
      while (e.getMessage().equals("/ by zero")) {
        atm1.transaction();
      }
    }

    System.out.println("Main connection is closed.");

  }
}