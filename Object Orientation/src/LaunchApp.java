import com.java.objects.classes.FanOverload;

public class LaunchApp extends Object{
  public static void main(String[] args) {

    FanOverload fan = new FanOverload("Xiaomi");
    System.out.println(fan.getBrand());
    System.out.println(fan.getNumBlades());
    System.out.println(fan.getColor());

  }
}

// BookEncapsulated book1 = new BookEncapsulated();book1.setPageNum(-1000);
// int pageNum = book1.getPageNum();

// System.out.println("Book 1 has "+pageNum+" pages.");

// System.out.println();

// // Test on Constructor Overloading:
// Student student = new Student("Bruce Wayne", 25, 100, "Gotham");System.out.println(student);

// Student student2 = new Student();System.out.println(student2);

// Student student3 = new Student("Tony Stark");System.out.println(student3);

// Student student4 = new Student("Bruce Banner", 20);