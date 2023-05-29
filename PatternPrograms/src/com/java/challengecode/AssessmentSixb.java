package com.java.challengecode;

import java.util.HashSet;
import java.util.PriorityQueue;

public class AssessmentSixb {
  public static void main(String[] args) {
    int n1 = 12;
    int[] primes1 = { 2, 7, 13, 19 };

    int n2 = 1;
    int[] primes2 = { 2, 3, 5 };

    System.out.println(getNSuperUglyNumber(n1, primes1)); //output: 32
    System.out.println(getNSuperUglyNumber(n2, primes2)); // output: 1
  }

  public static int getNSuperUglyNumber(int n, int[]primes) {
    HashSet<Long> seen = new HashSet<>();
    PriorityQueue<Long> heap = new PriorityQueue<>();
    seen.add(1L);
    heap.offer(1L);
    int ugly = 0;
    for (int i = 0; i < n; i++) {
      long curr = heap.poll();
      ugly = (int) curr;
      for (int prime : primes) {
        long next = curr * prime;
        if (seen.add(next)) {
          heap.offer(next);
        }
      }
    }
    return ugly;
  }
}
