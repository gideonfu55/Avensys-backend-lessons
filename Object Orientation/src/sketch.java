
class DemoOne extends Object {

  public void greet() {
    System.out.println("Hello team from DemoOne!");
  }

}

class DemoTwo extends Object {

  public void greet() {
    System.out.println("Hello team from DemoTwo!");
  }

}

class DemoThree extends DemoOne {
  
}

public class sketch extends Object {
  public static void main(String[] args) {
    DemoThree d3 = new DemoThree();
    d3.greet();
    
  }
}
