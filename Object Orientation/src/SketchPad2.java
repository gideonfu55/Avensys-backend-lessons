class DemoThree {
  // Liskov's Substitution Principle 1:
  public void greet() throws Exception {
    System.out.println("Hello Team!");
  }
}

class DemoFour extends DemoThree {
  public void greet() {
    System.out.println("Hello Team from Mario!");
  }
}

public class SketchPad2 {
  public static void main(String[] args) {
    System.out.println("Main connection is established.");
    System.out.println("Main connection is closed.");
  }
}
