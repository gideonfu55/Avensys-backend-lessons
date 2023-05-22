package com.java.objects.collections.lists;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListsAssignment {
  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>(20);
    LinkedList<String> ll1 = new LinkedList<>();

    al1.add("learning");
    al1.add("java");
    al1.add("is");
    al1.add("very");
    al1.add("fun");

    ll1.add("Java");
    ll1.add("LinkedList");
    ll1.add("is");
    ll1.add("better");
    ll1.add("!");

    System.out.println("\n=== Set/Update ===");
    al1.set(4, "awesome");
    System.out.println(al1);
    System.out.println("\n=== Contains Method ===");
    System.out.println(al1.contains("java"));
    System.out.println("\n=== Trim to Size ===");
    al1.trimToSize(); // trims initial capacity
    System.out.println(al1);

    System.out.println("\n=== Last Index Of ===");
    System.out.println(al1.lastIndexOf("fun"));
    System.out.println("\n=== Index Of ===");
    System.out.println(al1.indexOf("learning"));
    System.out.println("\n=== For Each ===");
    al1.forEach(item -> {
      System.out.println(item);
    });

    System.out.println("\n=== Set/Update ===");
    ll1.set(4, "?");
    System.out.println(ll1);
    System.out.println("\n=== Offer First ===");
    ll1.offerFirst("Yes");
    System.out.println(ll1);
    System.out.println("\n=== Offer Last ===");
    ll1.offerLast("No");
    System.out.println(ll1);
    System.out.println("\n=== Clone ===");
    System.out.println(ll1.clone());
    System.out.println("\n=== Element ===");
    System.out.println(ll1.element());
    System.out.println("\n=== For Each method ===");
    ll1.forEach(item -> {
      System.out.println(item + "1");
    });

  }
}
