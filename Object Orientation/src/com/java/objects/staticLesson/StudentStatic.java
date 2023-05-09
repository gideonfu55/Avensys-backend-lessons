package com.java.objects.staticLesson;

public class StudentStatic {
  
  static int a, b, c;

  static {
    a = 100;
    a = 200;
    a = 300;
  }

  public static void display() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  int m, n, o;

  {
    m = 10;
    n = 20;
    o = 30;
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
