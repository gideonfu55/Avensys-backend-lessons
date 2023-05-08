import com.java.objects.classes.BookEncapsulated;
import com.java.objects.classes.FanTwo;

public class LaunchApp {
  public static void main(String[] args) {

    BookEncapsulated book1 = new BookEncapsulated();
    book1.setPageNum(-1000);
    int pageNum = book1.getPageNum();

    System.out.println("Book 1 has " + pageNum + " pages.");

    FanTwo fan1 = new FanTwo();
    fan1.setAmount(-10);
    int fanAmount = fan1.getAmount();

    System.out.println("There are " + fanAmount + " fans.");
    
  }
}
