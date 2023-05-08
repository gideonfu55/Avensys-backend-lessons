import com.java.objects.classes.BookEncapsulated;
import com.java.objects.classes.Student;

public class LaunchApp {
  public static void main(String[] args) {

    BookEncapsulated book1 = new BookEncapsulated();
    book1.setPageNum(-1000);
    int pageNum = book1.getPageNum();

    System.out.println("Book 1 has " + pageNum + " pages.");

    System.out.println();

    Student student = new Student("Bruce Wayne", 25, 100, "Gotham");
    System.out.println(student);

    Student student2 = new Student();
    System.out.println(student2);
    
  }
}
