import java.util.Scanner;

interface CalculateInterest {
  public void acceptInput();
  public void findSimpleInterest();
  public void display();
}

class businessMan1 implements CalculateInterest {

  int loanAmount = 1000;
  int interestRate = 2;
  int simpleInterest = 0;

  public void acceptInput() {
    System.out.println("This is a fixed loan");
  }

  public void findSimpleInterest() {
    simpleInterest = loanAmount * interestRate / 100;
    System.out.println(simpleInterest);
  }

  public void display() {
    System.out.println("The simple interest for the loan per annum is: " + simpleInterest);
  }

}

class businessMan2 implements CalculateInterest {

  int loanAmount = 0;
  int interestRate = 3;
  int simpleInterest = 0;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    loanAmount = scan.nextInt();
    System.out.println("Your loan amount is: " + loanAmount);
  }

  public void findSimpleInterest() {
    simpleInterest = loanAmount * interestRate;
    System.out.println(simpleInterest);
  }

  public void display() {
    System.out.println("The simple interest for the loan per annum is: " + simpleInterest);
  }

}

class businessMan3 implements CalculateInterest {
  int loanAmount = 0;
  int interestRate = 4;
  int simpleInterest = 0;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    loanAmount = scan.nextInt();

    if (loanAmount <= 0) {
      System.out.println("Please enter a valid loan amount.");
      loanAmount = 0;
    } else {
      System.out.println("Your loan amount is: " + loanAmount);
    }
  }

  public void findSimpleInterest() {
    simpleInterest = loanAmount * interestRate;
    System.out.println(simpleInterest);
  }

  public void display() {
    System.out.println("The simple interest for the loan per annum is: " + simpleInterest);
  }

}

class BankTwo {
  public void acceptCalculateInterest(CalculateInterest ref) {
    ref.acceptInput();
    ref.findSimpleInterest();
    ref.display();
  }
}

public class sketch {
  public static void main(String[] args) {
    businessMan1 b1 = new businessMan1();
    businessMan2 b2 = new businessMan2();
    businessMan3 b3 = new businessMan3();

    BankTwo bankNew = new BankTwo();
    bankNew.acceptCalculateInterest(b1);
    bankNew.acceptCalculateInterest(b2);
    bankNew.acceptCalculateInterest(b3);
  }
}
