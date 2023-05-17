import java.util.Scanner;

// Custom Exception Handling:
class InvalidInputException extends Exception {
  
}

class ATMTwo {
  int userAccNum = 1111;
  String userPassword = "0123";
  int accInput;
  String pwInput;

  public void acceptInput() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the account number");
    accInput = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter the password");
    pwInput = scan.nextLine();
  }

  public void verify() {
    if (userAccNum == accInput && userPassword.equals(pwInput)) {
      System.out.println("Account holder verified. Please retrieve your money.");
    } else {
      System.out.println("Verification error. Please contact the Bank HQ.");
    }
  }
}

class Bank {
  public void initiate() {
    ATMTwo atm = new ATMTwo();
    atm.acceptInput();
    atm.verify();
  }
}

public class SketchPad {
  public static void main(String[] args) {
    Bank bank1 = new Bank();
    bank1.initiate();
  }
}
