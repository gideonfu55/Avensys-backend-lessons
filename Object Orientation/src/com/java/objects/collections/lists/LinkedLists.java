package com.java.objects.collections.lists;
import java.util.LinkedList;

public class LinkedLists {
  public static void main(String[] args) {
    
    LinkedList<String> ll = new LinkedList<>();
    ll.add("Batman");
    ll.add("is");
    ll.add("Bruce");
    ll.add("Wayne");
    ll.add("yes");
    ll.add("yes");
    // It maintains the insertion order just like ArrayLists.
    System.out.println(ll);

    ll.add(0, "Selina Kyle loves Batman.");
    System.out.println(ll);

    LinkedList<String> ll2 = new LinkedList<>();
    ll2.add("Peter");
    ll2.add("Parker");

    ll.addAll(ll2);
    System.out.println(ll);

    ll.addFirst("Haha");
    ll.addLast("Excuse.");
    System.out.println(ll);

    ll.removeAll(ll2);
    System.out.println(ll);
  }
}
