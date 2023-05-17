import java.util.Scanner;

// Custom Exception Handling:
class InvalidInputException extends Exception {
  public String getMessage() {
    return "Invalid entry.";
  }
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

  public void verify() throws InvalidInputException {
    if (userAccNum == accInput && userPassword.equals(pwInput)) {
      System.out.println("Account holder verified. Please retrieve your money.");
    } else {
      InvalidInputException ie = new InvalidInputException();
      throw ie;
    }
  }
}

class Bank {
  public void initiate() {
    ATMTwo atm = new ATMTwo();
    try {
      atm.acceptInput();
      atm.verify();
    } catch (InvalidInputException e1) {
      System.out.println("Invalid input. You have 2 more chances to enter correct details.");
      try {
        atm.acceptInput();
        atm.verify();
      } catch (InvalidInputException e2) {
        System.out.println("Invalid input. You have 1 more chances to enter correct details.");
        try {
          atm.acceptInput();
          atm.verify(); 
        } catch (InvalidInputException e3) {
          System.out.println("Invalid input. You have maxed out your number of tries. You card is blocked. Please contact your bank.");
        }
      }
    }
  }
}

public class SketchPad {
  public static void main(String[] args) {
    Bank bank1 = new Bank();
    bank1.initiate();
  }
}
