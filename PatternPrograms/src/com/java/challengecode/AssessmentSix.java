package com.java.challengecode;

public class AssessmentSix {
  public static void main(String[] args) {
    int[] prices1 = { 7, 1, 5, 3, 6, 4 };
    int[] prices2 = { 7, 6, 4, 3, 1 };

    System.out.println(maxProfit(prices1));
    System.out.println(maxProfit(prices2));

  }

  public static int maxProfit(int[] prices) {

    if (prices.length == 0) {
      return 0;
    }

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    
    for (int price: prices) {
      if (price < minPrice) {
        minPrice = price;
      } else if (price - minPrice > maxProfit) {
        maxProfit = price - minPrice;
      }
    }

    return maxProfit;

  }
}
