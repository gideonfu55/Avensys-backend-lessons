package com.java.objects.testCode;

// public class Example {
  
// }

public class Testing1 {

  int x;
  int y;

  void add(int a) {
    x = a + 1;
  }

  void add(int a, int b) {
    x = a + 2;
  }
}

class Testing1_methods {
  public static void main(String args[]) {
    Testing1 obj = new Testing1();
    int a = 0;
    obj.add(6);
    System.out.println(obj.x);
  }
}

// public static void main(String[] args) {

// int count = 1;
// while (count <= 15) {
// System.out.println(count % 2 == 1? "***" : "+++++");
// ++count;
// } // end while
// } // end main

// public static synchronized void main(String[] args) throws
// InterruptedException {
// Thread f = new Thread();
// f.start();
// System.out.println("A");
// f.wait(1000);
// System.out.print("B");
// }

// public void ml(int i, float f) {
//   System.out.println(" int float method");
// }

// public void m1(float f, int i) {
//   System.out.println("float int method");
// }

// public static void main (String[] args) {
//     Testing1 s = new Testing1();
//     s.m1(20,20);
//   }
