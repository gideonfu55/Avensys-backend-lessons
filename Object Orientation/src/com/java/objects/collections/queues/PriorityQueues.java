package com.java.objects.collections.queues;
import java.util.PriorityQueue;

public class PriorityQueues {
  public static void main(String[] args) {

    // Priority Queue creation:
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // pq.add(100);
    // pq.add(50);

    // System.out.println(pq);
    
    // pq.add(25);
    // pq.add(150);
    // pq.add(125);
    pq.add(50);
    pq.add(25);
    pq.add(100);
    pq.add(75);
    pq.add(10);
    System.out.println(pq);
    System.out.println(pq.comparator());
  }
}
