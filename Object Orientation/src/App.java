import com.java.objects.classes.Bird;
import com.java.objects.classes.BookEncapsulated;
import com.java.objects.classes.Fan;
import com.java.objects.classes.FanOverload;
import com.java.objects.classes.Monitor;
import com.java.objects.classes.Student;

public class App {
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
    }
}
