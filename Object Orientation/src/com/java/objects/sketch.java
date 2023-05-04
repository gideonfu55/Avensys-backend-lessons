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

    /**
     * Mutable String Types: 
     * StringBuffer
     */
    StringBuffer sb = new StringBuffer("This is");
    sb.append(" a Java Class. Like the object. Not the classroom. Nvm.");
    System.out.println(sb);

    // In StringBuffer, the default starting capacity is 16.
    StringBuffer sbCapacity = new StringBuffer();
    System.out.println(sbCapacity.capacity());

    // If more characters are added, the StringBuffer will automatically resize itself to accommodate the extra storage required.
    System.out.println(sb.capacity()); // this is exactly the size of the number of chars in the new StringBuffer

    /*
     * StringBuilder
     */

    StringBuilder sbuild = new StringBuilder("This is");
    sbuild.append(" a Java Class. Like the object. Not the classroom. Nvm.");

    System.out.println(sbuild);
    System.out.println(sbuild.capacity());

  }
}
