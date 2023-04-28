package com.java.programs;

// Java Lesson 1 (19/04/2023) - Loops
public class PatternOne {
  
  public static void main(String[] args) {
    
    // For looping with numbers:
    // for (initialization state - starting number; condition; change of state - increment/decrement)
    for (int i = 1; i <= 5; i++) {
      System.out.println("*");
    }

    System.out.println("\n");

    // You can loop on chars too:
    for (char o = 'a'; o <= 'e'; o++) {
      System.out.print(o);
    }

    // Output: abcde
    System.out.println("\n");

    // <Important Section> Understand the pattern for Nested For loops:
    // - * Outer loop runs similarly, but inner loop will complete all iterations first before going back to the outer loop
    // Exercise (print 5 * in 5 rows):
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    /**
     * =============================================
     * Exercises in printing shape patterns with *
     * =============================================
     */
    
     // Exercise (print decreasing * after each row):
    /**
     * Output expected:
     * *****
     * ****
     * ***
     * **
     * *
     * 
     */

    for (int i = 1; i <= 5; i++) {
      System.out.println("");
      for (int o = 5; o >= i; o--) {
        System.out.print("*");
      }
    }

    System.out.println("\n");

    // Exercise (print increasing * after each row):
    /**
     * Output expected:
     * *
     * **
     * ***
     * ****
     * *****
     * 
     */

    for (int i = 1; i <= 5; i++) {
      for (int o = 1; o <= i; o++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("\n");

    // Exercise:
    /**
     * Output:
     * *****^^^^^
     * *****^^^^^
     * *****^^^^^
     * *****^^^^^
     * *****^^^^^
     * 
     */
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= 5; k++) {
        System.out.print("^");
      }
      System.out.println("");
    }

    System.out.println("\n");

    // Exercise:
    /**
     * Output:
     * *^^^^^
     * **^^^^^
     * ***^^^^^
     * ****^^^^^
     * *****^^^^^
     * 
     */
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= 5; k++) {
        System.out.print("^");
      }
      System.out.println("");
    }

    // Java Assignment (18/04/2023):
    /**
     * Output:
     *     *
     *    * *
     *   * * *
     *  * * * *
     * * * * * *
     * 
     */

    /**
     * Output:
     *     *
     *    **
     *   ***
     *  ****
     * *****
     * 
     */

    /**
     * Output:
     * * * * * *
     *  * * * *
     *   * * *
     *    * *
     *     *
     * 
     */

    System.out.println("");

    // Exercise A - Pyramid:
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println("");

    // Exercise B - Half Triangle:
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("");

    // Exercise C - Inverted Pyramid:
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 5; k >= i; k--) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();

    // for (int i = 0; i < 5; i++) {
    //   for (int j = 0; j < i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int k = i; k < 5; k++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j < i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int k = n; k >= i; k--) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // Exercise D - Square Box
    /**
     * Output:
     * * * * * *
     * *       *
     * *       *
     * *       *
     * * * * * *      
     * 
     */

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 5; k >= i; k--) {
        System.out.print("* ");
      }
      System.out.println();
    }

    System.out.println();

    // Method for hollow triangle:
    /**
     * Output:
     *    *
     *   * *
     *  *   *
     * * * * *
     * 
     */
    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 6; j++) {
        if ((i + j == 3) || (j - i == 3) || (i == 3 && j % 2 == 0)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }

    System.out.println("");

    // Method for printing diamond:
    /** 
     *    *
     *   * *
     *  *   *
     *   * *
     *    *
     */
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= 4; j++) {
        if ((i + j == 2) || (i - j == 2) || (j - i == 2) || (i + j == 6)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }

    System.out.println("");

    // Java Assignment (19/04/2023):
    // Method for printing Heart:
    /**
     *   ** **
     *  *  *  *
     *   *   *
     *    * *
     *     *
     * */
    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j <= 6; j++) {
        if ((i == 0 && j != 3 && j >= 1 && j <= 5) || (i == 1 && j % 3 == 0) || (i - j == 2) || (i + j == 8)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }

    System.out.println();

    // Method for printing upward arrow:
    /**
     *     *
     *    * *
     *   *   *
     *  *     *
     * *       *
     */
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= 8; j++) {
        if ((i + j == 4) || (j - i == 4)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }

    System.out.println();



    /**
     * =======================================
     * Exercises in printing number patterns
     * =======================================
     */

    /**
     * Output:
     *  1  2  3
     *  4  5  6
     *  7  8  9
     * 10 11 12
     * 13 14 15
     * 
     */

    int q = 0;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= 2; j++) {
        q++;
        if (String.valueOf(q).length() < 2) {
          System.out.print(q + "  ");
        } else {
          System.out.print(q + " ");
        }
        
      }
      System.out.println();
    }

    System.out.println();
    
    /**
     * Output:
     * 1 
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 
     */
    for (int i = 0; i <= 4; i++) {
      // int o = 1;
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1 + " ");
        // o++;
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    // for (int i = 0; i <= 4; i++) {
    //   int r = 1;
    //   for (int j = 4; j >= i; j--) {
    //     System.out.print(r + " ");
    //     r++;
    //   }
    //   System.out.println();
    // }

    // Better approach:
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */
    int r = 1;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(r + " ");
        r++;
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * 10
     * 9 8
     * 7 6 5
     * 4 3 2 1
     */
    int count = 10;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count--;
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * 1
     * 2 1
     * 3 2 1
     * 4 3 2 1
     * 5 4 3 2 1
     */
    for (int i = 1; i <= 5; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    System.out.println();

    // Java Assignment (20/04/2023):
    /**
     * Output:
     * 5
     * 5 4
     * 5 4 3
     * 5 4 3 2
     * 5 4 3 2 1
     */

    for (int i = 5; i >= 1; i--) {
      for (int j = 5; j >= i; j--) {
        System.out.print(j + " ");
     }
      System.out.println();
    }

     System.out.println();

    /**
     * Output:
     * 1
     * 1 0
     * 1 0 1
     * 1 0 1 0
     * 1 0 1 0 1
     */

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 != 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }

    System.out.println();

    // CHALLENGE for number pattern!
    /**
     * Output:
     *     1
     *    232
     *   34543
     *  4567654
     * 567898765
     */
    int rows = 5;

    for (int i = 1; i <= rows; i++) {
      int middleInt = i * 2 - 1;
      for (int j = rows - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= middleInt; k++) {
        if (k >= 1 && k <= i) {
          System.out.print(k + i - 1);
        } else {
          System.out.print(middleInt - k + i);
        }
      }
      System.out.println("");
    }

    System.out.println();

    /**
     * ==========================================
     * Exercises in printing character patterns
     * ==========================================
     * - Lesson: in Java, character can be represented/encoded in terms of integers.
     * 
     * - You need to use typecasting [e.g. (char)Alpha] to get the corresponding character 
     * of the integer.
     * 
     * - A is 65 in its corresponding integer.
     */

    /**
     * Output:
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     */
    int alpha = 65;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (alpha + j) + " ");
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * A
     * B B
     * C C C
     * D D D D
     * E E E E E
     */
    int b = 65;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (b) + " ");
      }
      b++;
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * a
     * a a
     * b b b
     * d d d d
     * e e e e e
     */
    for (int i = 0, c = 'a'; i <= 4; i++, c++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (c) + " ");
      }
      System.out.println();
    }

    // Side lesson - To understand for loops better:
    // int i = 0;
    // for (System.out.println("Hi"); i <= 10; i++) {
    // System.out.println("hello");
    // }

    System.out.println();

    int num = 0;
    for (System.out.println("Hi"); num <= 10; System.out.println("World")) {
      System.out.println("hello");
      num++;
    }

    System.out.println();

    /**
     * Output:
     * E
     * D D
     * C C C
     * B B B B
     * A A A A A
     */
    int d = 69;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) d + " ");
      }
      d--;
      System.out.println();
    }

    System.out.println();
    /**
     * Output:
     * A
     * C C
     * E E E
     * G G G G
     * I I I I I
     */
    int e = 65;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) e + " ");
      }
      e += 2;
      System.out.println();
    }

    System.out.println();
    /**
     * Output:
     * A
     * B B
     * A A A
     * B B B B
     * A A A A A
     */
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        if (i % 2 != 0) {
          System.out.print("B" + " ");
        } else {
          System.out.print("A" + " ");
        }
      }
      System.out.println();
    }

    System.out.println();

    // Java Assignment (21/04/2023):
    /**
     * E
     * ED
     * EDC
     * EDCB
     * EDCBA
     */
    System.out.println("Exercise A:");
    int a = 69;
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (a - j));
      }
      System.out.println();
    }

    System.out.println();

    /**
     * Output:
     * EDCBA
     *  DCBA
     *   CBA
     *    BA
     *     A
     */
    System.out.println("Exercise B:");
    int alphaB = 65;
    for (int i = 0; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = 4; k >= i; k--) {
        System.out.print((char) (alphaB + k));
      }
      alphaB--;
      System.out.println();
    }

    /**
     * Output:
     *     A
     *    ABC
     *   ABCDE
     *  ABCDEFG
     * ABCDEFGHI
     */
    System.out.println("Exercise C:");
    int alphaC = 65;
    for (int i = 1; i <= 5; i++) {
      for (int j = 5 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * i - 1); k++) {
        System.out.print((char) (alphaC + k));
      }
      System.out.println();
    }

    System.out.println();
  }
}