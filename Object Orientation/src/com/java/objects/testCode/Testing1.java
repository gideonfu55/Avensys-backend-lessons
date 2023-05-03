package com.java.objects.testCode;

// public class Example {
  
// }

public class Testing1 {
  // public static void main(String[] args) {
    
  //   int count = 1;
  //   while (count <= 15) {
  //     System.out.println(count % 2 == 1? "***" : "+++++");
  //     ++count;
  //   } // end while
  // } // end main

  public static synchronized void main(String[] args) throws InterruptedException {
    Thread f = new Thread();
    f.start();
    System.out.print("A");
    f.wait(1000);
    System.out.print("B");
  }
}

