package com.java.objects.datatypes;

public class Strings {
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
    System.out.println(methodsTestString.toUpperCase()); // SUPER MARIO HATES MUSHROOMS.
    System.out.println("*******************************");
    System.out.println(methodsTestString.toLowerCase()); // super mario hates mushrooms.
    System.out.println("*******************************");
    System.out.println(methodsTestString.contains("mushrooms")); // true
    System.out.println(methodsTestString.contains("carrots")); // false
    System.out.println("*******************************");
    System.out.println(methodsTestString.indexOf('u')); // 1
    System.out.println("*******************************");
    System.out.println(methodsTestString.charAt(7)); // 'a'
    System.out.println("*******************************");
    System.out.println(methodsTestString.substring(6)); // Mario hates mushrooms.
    System.out.println("*******************************");
    System.out.println(methodsTestString.substring(0, 12)); // Super Mario

    // Ignoring Case in Strings:
    String s8 = "Gideon";
    String s9 = "gideon";

    if (s8.equalsIgnoreCase(s9)) {
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

    // If more characters are added, the StringBuffer will automatically resize
    // itself to accommodate the extra storage required.
    System.out.println(sb.capacity()); // this is exactly the size of the number of chars in the new StringBuffer

    /*
     * StringBuilder
     * - Similar to StringBuffer in function, but different in terms of performance.
     */

    StringBuilder sbuild = new StringBuilder("This is");
    sbuild.append(" a Java Class. Like the object. Not the classroom. Nvm.");

    System.out.println(sbuild);
    System.out.println(sbuild.capacity());

    /*
     * Methods for StringBuilders and StringBuffers (actually similar to String)
     * 
     */

    StringBuilder sbuilderEx = new StringBuilder("Java is fun");
    StringBuilder sbuilderEx2 = new StringBuilder("java is fun");

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("1. Equals method:");
    if (sbuilderEx.equals(sbuilderEx2)) {
      System.out.println("The strings are equal.");
    } else {
      System.out.println("The strings are not equal.");
    }

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("2. compareTo method:");
    if (sbuilderEx.compareTo(sbuilderEx2) > 0) {
      System.out.println("sbuilderEx is greater than sbuilderEx2.");
    } else if (sbuilderEx.compareTo(sbuilderEx2) < 0) {
      System.out.println("sbuilderEx2 is greater than sbuilderEx.");
    } else {
      System.out.println("Both are equal.");
    }

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("3. indexOf method:");
    System.out.println(sbuilderEx.indexOf("a", 0));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("4. charAt method:");
    System.out.println(sbuilderEx.charAt(5));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("5. subString all method:");
    System.out.println(sbuilderEx.substring(0));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("6. subString selection method:");
    System.out.println(sbuilderEx.substring(0, 4));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("7. append method:");
    System.out.println(sbuilderEx.append(". We enjoy writing Java."));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("8. insert method:");
    System.out.println(sbuilderEx.insert(7, " very"));

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("9. reverse method:");
    System.out.println(sbuilderEx.reverse());

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("10. ensureCapacity method:");
    StringBuilder sbuilderEx3 = new StringBuilder();
    sbuilderEx3.ensureCapacity(50);
    System.out.println(sbuilderEx3.capacity());

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("11. length method:");
    System.out.println(sbuilderEx2.length());

    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("12. capacity method:");
    System.out.println(sbuilderEx.capacity());

  }
  
}
