
class DemoOne {
  public DemoOne() {
  }
}

class DemoTwo extends DemoOne {
  public DemoTwo() {
    super();
  }
}

// class DemoThree extends DemoTwo {

// }

public class sketch extends Object {
  public static void main(String[] args) {
    DemoTwo d2 = new DemoTwo();
  }
}
