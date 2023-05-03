package com.java.objects;

public class sketch {
  public static void main(String[] args) {

    String methodsTestString = new String("Super Mario hates mushrooms.");
    System.out.println("*******************************");
    System.out.println(methodsTestString.toUpperCase()); 
    System.out.println("*******************************");
    System.out.println(methodsTestString.toLowerCase());
    System.out.println("*******************************");
    System.out.println(methodsTestString.contains("mushrooms"));
    System.out.println(methodsTestString.contains("carrots"));
    System.out.println("*******************************");
    System.out.println(methodsTestString.indexOf('u'));
    System.out.println("*******************************");
    System.out.println(methodsTestString.charAt(7));
    System.out.println("*******************************");
    System.out.println(methodsTestString.substring(6));
    System.out.println("*******************************");
    System.out.println(methodsTestString.substring(0, 12));

  }
}
