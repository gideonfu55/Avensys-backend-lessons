package com.java.objects.collections;
import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    
    // Type based ArrayList creation:
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<Integer> b = new ArrayList<>();
    System.out.println(a);
    System.out.println(b);

    // Generic ArrayList creation and add method (note that this is not good practice):
    ArrayList a1 = new ArrayList(20);
    System.out.println(a1.isEmpty());
    System.out.println(a1.size());
    a1.add("Batman");
    a1.add(100);
    a1.add(3.5);
    a1.add('c');

    // Add elements:
    a1.add(0, "Singapore");
    System.out.println(a1);
    ArrayList al2 = new ArrayList();
    al2.add("Batman2");
    al2.add("Bruce Wayne");
    a1.addAll(2, al2);
    System.out.println(a1);

    // Remove elements:
    a1.remove(0);
    a1.removeAll(al2);
    System.out.println(a1);

    // Retain elements:
    ArrayList a3 = new ArrayList();
    a3.add("Batman");
    a1.retainAll(a3);
    System.out.println(a1);
    
  }
}
