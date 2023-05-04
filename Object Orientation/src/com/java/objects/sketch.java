package com.java.objects;

public class sketch {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Java is fun");
    StringBuilder sb2 = new StringBuilder("java is fun");

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("1. Equals method:");
    if (sb.equals(sb2)) {
      System.out.println("The strings are equal.");
    } else {
      System.out.println("The strings are not equal.");
    }
    
    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("2. compareTo method:");
    if (sb.compareTo(sb2) > 0) {
      System.out.println("sb is greater than sb2.");
    } else if (sb.compareTo(sb2) < 0) {
      System.out.println("sb2 is greater than sb.");
    } else {
      System.out.println("Both are equal.");
    }

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("3. indexOf method:");
    System.out.println(sb.indexOf("a", 0));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("4. charAt method:");
    System.out.println(sb.charAt(5));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("5. subString all method:");
    System.out.println(sb.substring(0));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("6. subString selection method:");
    System.out.println(sb.substring(0, 4));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("7. append method:");
    System.out.println(sb.append(". We enjoy writing Java."));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("8. insert method:");
    System.out.println(sb.insert(7, " very"));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("9. reverse method:");
    System.out.println(sb.reverse());

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("10. ensureCapacity method:");
    StringBuilder sb3 = new StringBuilder();
    sb3.ensureCapacity(50);
    System.out.println(sb3.capacity());

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("11. length method:");
    System.out.println(sb2.length());

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("12. capacity method:");
    System.out.println(sb.capacity());

  }
}
