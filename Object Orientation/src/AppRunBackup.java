import com.java.objects.accessmodifier.staticLesson.FanStatic;
import com.java.objects.accessmodifier.staticLesson.Loan;
import com.java.objects.accessmodifier.staticLesson.StudentStatic;
import com.java.objects.accessmodifier.staticLesson.StudentStatic2;
import com.java.objects.classes.encapsulation.BookEncapsulated;
import com.java.objects.classes.overloading.FanOverload;
import com.java.objects.classes.starters.Bird;
import com.java.objects.classes.starters.Fan;
import com.java.objects.classes.starters.Monitor;
import com.java.objects.classes.starters.Student;

public class AppRunBackup {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // New bird object:
        Bird tweety = new Bird("Tweety", "Canary", "Yellow");

        // Test bird methods:
        System.out.println();
        tweety.fly();

        System.out.println();
        tweety.peck("carrots");

        System.out.println();
        System.out.println(tweety);

        // New monitor object:
        Monitor samsung = new Monitor("Samsung", "rectangle", "black", 9);

        // Test monitor methods:
        System.out.println();
        samsung.brightnessUp();

        System.out.println();
        samsung.blueScreen();

        System.out.println();
        System.out.println(samsung);

        // Objects exercise:
        Fan panasonic = new Fan("Black", "Panasonic", 4);
        Fan samsungNew = new Fan("Green", "Samsung", 4);
        Fan mitsubishi = new Fan("Black", "Mitsubishi", 4);

        System.out.println();

        panasonic.rotate();
        samsungNew.stop();
        mitsubishi.blowAir();

        BookEncapsulated book1 = new BookEncapsulated();book1.setPageNum(-1000);
        int pageNum = book1.getPageNum();

        System.out.println("Book 1 has "+pageNum+" pages.");

        System.out.println();

        // Test on Constructor Overloading:
        Student student = new Student("Bruce Wayne", 25, 100,
        "Gotham");System.out.println(student);

        Student student2 = new Student();
        System.out.println(student2);

        Student student3 = new Student("Tony Stark");
        System.out.println(student3);

        Student student4 = new Student("Bruce Banner", 20);
        System.out.println(student4);

        // For Overload Constructor and Constructor Chaining lesson 
        FanOverload fan = new FanOverload("Xiaomi");
        System.out.println(fan.getBrand());
        System.out.println(fan.getNumBlades());
        System.out.println(fan.getColor());

        // For Static Scope Lesson:
        StudentStatic.displayOne();

        StudentStatic demo = new StudentStatic();
        demo.displayTwo();

        FanStatic.displayOne();

        FanStatic demoFan = new FanStatic();
        demoFan.displayTwo();

        // For Static Variables Lesson:
        StudentStatic2 student1 = new StudentStatic2();
        student1.acceptInput();
        student1.display();
        System.out.println("****************************");
        StudentStatic2 student5 = new StudentStatic2();
        student5.acceptInput();
        student5.display();
        System.out.println("****************************");
        StudentStatic2 student6 = new StudentStatic2();
        student6.acceptInput();
        student6.display();
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
