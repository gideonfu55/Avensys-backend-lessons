import com.java.objects.classes.inheritance.FanChild;

public class LaunchApp {
  public static void main(String[] args) {

    FanChild fan = new FanChild(null, 0, null);
    System.out.println(fan.getBrand());
    
    fan.blowAir();
    
  }
}