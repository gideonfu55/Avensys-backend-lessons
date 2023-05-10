import com.java.objects.classes.Loan;
import com.java.objects.classes.StudentStatic;

public class LaunchApp {
  public static void main(String[] args) {
    
    StudentStatic student1 = new StudentStatic();
    student1.acceptInput();
    student1.display();
    System.out.println("****************************");
    StudentStatic student2 = new StudentStatic();
    student2.acceptInput();
    student2.display();
    System.out.println("****************************");
    StudentStatic student3 = new StudentStatic();
    student3.acceptInput();
    student3.display();
    System.out.println("****************************");

    Loan loan1 = new Loan();
    loan1.acceptInput();
    loan1.findSI();
    loan1.display();
    System.out.println("************************");
    Loan loan2 = new Loan();
    loan2.acceptInput();
    loan2.findSI();
    loan2.display();
    System.out.println("************************");
    Loan loan3 = new Loan();
    loan3.acceptInput();
    loan3.findSI();
    loan3.display();
    System.out.println("************************");
    
  }
}

// StudentStatic.displayOne();

//     StudentStatic demo = new StudentStatic();
//     demo.displayTwo();

    // FanStatic.displayOne();

    // FanStatic demoFan = new FanStatic();
    // demoFan.displayTwo();