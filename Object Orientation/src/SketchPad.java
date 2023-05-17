import java.util.Scanner;

class ATM {
  public void alpha() {
    try {
      System.out.println("Connection 1 is established.");
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the numerator");
      int a = scan.nextInt();
      System.out.println("Enter the denominator");
      int b = scan.nextInt();
      int c = a / b;
      System.out.println("Result is: " + c);
      System.out.println("Connection 1 is closed.");

    } catch (Error e) {
      System.out.println("A problem occurred during the input.");
    }
    System.out.println("Connection 1 is Closed");
  }
}

class SketchPad {
  public static void main(String[] args) {
    System.out.println("Main connection is established.");
    ATM atm1 = new ATM();
    atm1.alpha();
    System.out.println("Main connection is closed.");

  }
}