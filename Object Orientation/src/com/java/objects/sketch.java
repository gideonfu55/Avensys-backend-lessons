package com.java.objects;

public class sketch {
  public static void main(String[] args) {

    String s1 = "Gideon";
    String s2 = "gideon";

    if (s1.equalsIgnoreCase(s2)) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are unequal");
    }

    StringBuffer sb = new StringBuffer("This is");
    System.out.println(sb);

  }
}
