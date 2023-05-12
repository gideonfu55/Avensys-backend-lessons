
class DemoOne extends Object {
  int a = 10;
}

class DemoTwo extends DemoOne {
  public void greet() {
    System.out.println("Hello team from DemoTwo!");
  }
}

class DemoThree extends DemoTwo {

}

public class sketch extends Object {
  public static void main(String[] args) {
    DemoThree d3 = new DemoThree();
    System.out.println(d3.a);
  }
}
