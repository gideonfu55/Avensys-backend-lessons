package com.java.objects.collections.queues;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustom {
  public static void main(String[] args) {
    // Create a custom comparator
    Comparator<Integer> customComparator = new CustomComparator();

    // Create a PriorityQueue with the custom comparator
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(customComparator);

    // Add elements to the PriorityQueue
    priorityQueue.add(5);
    priorityQueue.add(2);
    priorityQueue.add(8);
    priorityQueue.add(1);
    priorityQueue.add(10);

    // Print the elements from the PriorityQueue
    while (!priorityQueue.isEmpty()) {
      System.out.println(priorityQueue.poll());
    }

    System.out.println(priorityQueue);

    // Print the elements in order from the PriorityQueue
    // System.out.println(priorityQueue.poll());
    // System.out.println(priorityQueue.poll());
    // System.out.println(priorityQueue.poll());
    // System.out.println(priorityQueue.poll());
    // System.out.println(priorityQueue.poll());
    // System.out.println(priorityQueue.poll());
  }

  // Custom comparator implementation
  static class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      // Custom logic for comparing integers
      // Return a negative value if o1 should be placed before o2,
      // Return a positive value if o1 should be placed after o2,
      // Return 0 if o1 and o2 are considered equal in terms of priority
      return o2 - o1;
    }
  }
}