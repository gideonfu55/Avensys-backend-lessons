import java.util.Scanner;

class DemoOne {
  public void alpha() {

    System.out.println("Connection 1 is established.");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numerator");
    int a = scan.nextInt();
    System.out.println("Enter the denominator");
    int b = scan.nextInt();
    int c = a / b;
    System.out.println("Result is: " + c);
    System.out.println("Connection 1 is closed.");
  }
}

public class SketchPad2 {
  public static void main(String[] args) {
    System.out.println("Main Connection is established");
    DemoOne d1 = new DemoOne();
    d1.alpha();
    System.out.println("Main Connection is closed.");
  }
}
