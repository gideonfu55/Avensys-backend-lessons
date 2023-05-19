package com.java.objects.collections.sets;
import java.util.TreeSet;

public class TreeSetsLesson {
  public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<Integer>();
    ts.add(10);
    ts.add(20);
    ts.add(30);
    ts.add(40);

    System.out.println(ts.ceiling(40));
    System.out.println(ts.floor(10));
    System.out.println(ts.higher(40));
    System.out.println(ts.lower(10));
  }
}
