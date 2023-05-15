package com.java.objects.classes.constructorchain;
class Demo1 extends Object {
  int a;
  int b;

  public Demo1() {
    a = 10;
    b = 20;
  }

  public Demo1(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

class Demo2 extends Demo1 {
  public Demo2() {
    super();
    a = 100;
    b = 200;
  }

  public Demo2 (int a, int b) {
    this.a = a;
    this.b = b;
  }
}

public class DrawFlowAssignment extends Object {
  public static void main(String[] args) {
    Demo2 d2 = new Demo2(1000, 2000);
    System.out.println(d2.a);
    System.out.println(d2.b);
  }
}
