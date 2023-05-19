package com.java.objects.collections.sets;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetsAll {
  public static void main(String[] args) {
    HashSet<Integer> hs1 = new HashSet<Integer>(); // Hashing algorithm is provided.
    hs1.add(10);
    hs1.add(20);
    hs1.add(30);
    System.out.println(hs1); // insertion order will not be preserved

    LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>(); // Hashing algorithm is provided.
    lhs1.add(10);
    lhs1.add(20);
    lhs1.add(30);
    System.out.println(lhs1); // insertion order is preserved
  }
}
