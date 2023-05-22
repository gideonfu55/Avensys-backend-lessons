package com.java.objects.collections.lists;
import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    
    // Type based ArrayList creation:
    ArrayList<String> a = new ArrayList<String>();
    // ArrayList<Integer> b = new ArrayList<>();

    // Generic ArrayList creation and add method (note that this is not good practice):
    // ArrayList a1 = new ArrayList(20);
    // System.out.println(a1.isEmpty());
    // System.out.println(a1.size());
    a.add("Batman");
    a.add("is");
    a.add("the");
    a.add("best");

    // Get elements:
    System.out.println(a.get(3));

    // Set elements:
    a.set(3, "greatest");
    System.out.println(a);

    // Add elements:
    a.add(0, "The");
    System.out.println(a);
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("Batman2");
    al2.add("Bruce Wayne");
    a.addAll(2, al2);
    System.out.println(a);

    // Remove elements:
    a.remove(0);
    a.removeAll(al2);
    System.out.println(a);

    // Retain elements:
    ArrayList<String> a3 = new ArrayList<>();
    a3.add("Batman");
    a.retainAll(a3);
    System.out.println(a);
    
  }
}
