package com.java.objects.accessmodifier.staticLesson;

public class StudentStatic {
  
  static int a, b, c;

  static {
    a = 100;
    b = 200;
    c = 300;
  }

  public static void displayOne() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  int m, n, o;

  {
    m = 100;
    n = 200;
    o = 300;
    a = 400;
    b = 500;
    c = 600;
  }

  public void displayTwo() {
    System.out.println(m);
    System.out.println(n);
    System.out.println(o);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

}
