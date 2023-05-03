package com.java.objects.datatype;

public class strings {
  public static void main(String[] args) {
    
    String s1 = new String("Gideon");
    String s2 = new String("Gideon");
    
    // Understanding how the 2 variables are reference pointers that point to the same object:
    if (s1.equals(s2)) {
      System.out.println("References are equal.");
    } else {
      System.out.println("References are not equal.");
    }

    String s3 = "Gideon";
    String s4 = new String("Gideon");

    // Understanding how the 2 variables are reference pointers that point to the
    // same object:
    if (s3.equals(s4)) {
      System.out.println("References are equal.");
    } else {
      System.out.println("References are not equal.");
    }

    // s1 += "hero";
    String s5 = s1.concat("hero");
    System.out.println(s5);

    // Using the compareTo method:
    String s6 = "Sachin";
    String s7 = "Sourav";

    if (s6.compareTo(s7) > 0) {
      System.out.println("String 6 is greater than String 7");
    } else if (s6.compareTo(s7) < 0) {
      System.out.println("String 7 is greater than String 6");
    } else {
      System.out.println("Both Strings are equal.");
    }

    // Other build-in methods for Strings:
    String methodsTestString = new String("Super Mario hates mushrooms.");
    System.out.println("*******************************");
    System.out.println(methodsTestString.toUpperCase()); // THIS IS A JAVA CLASS
    System.out.println("*******************************");
    System.out.println(methodsTestString.toLowerCase()); // this is a java class
    System.out.println("*******************************");
    System.out.println(methodsTestString.contains("Class")); // true
    System.out.println(methodsTestString.contains("python")); // false
    System.out.println("*******************************");
    System.out.println(methodsTestString.indexOf('u')); // 
    System.out.println("*******************************");
    System.out.println(methodsTestString.charAt(7)); // 
    System.out.println("*******************************");
    System.out.println(methodsTestString.substring(8)); //
    System.out.println("*******************************");
    System.out.println(methodsTestString.substring(8, 12)); //

  }
  
}
