import com.java.objects.classes.FanOverload;

public class LaunchApp extends Object{
  public static void main(String[] args) {

    FanOverload fan = new FanOverload("Xiaomi");
    System.out.println(fan.getBrand());
    System.out.println(fan.getNumBlades());
    System.out.println(fan.getColor());

  }
}