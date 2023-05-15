package com.java.objects.datatypes;

public class DataTypesLesson {

  public static void main(String[] args) {
    
    // byte a = 0b01000101;
    // System.out.println(a);

    // // long b = 9223372036854775807L;
    // // System.out.println(b);

    // float b = 25.17f;
    // System.out.println(b);

    // double c = 25.17f;
    // System.out.println(c);
    
    // // Typecasting:
    // int n = 200;
    // byte m;
    // m = (byte)n;

    // System.out.println(m); // Reason it is giving -56 is because at the upper limit of a byte (which 127), it still 72 to go, after which it will start from its lower limit (-128) and add the remaining 72. Thus -128 + 72 = -56.

    // Assignment (27/04/2023):
    // Implicit:
    // Convert byte to short
    // int -----> long
    // float -----> double
    // char -----> int

    byte a = 20;
    short b = a;
    System.out.println(b);

    int c = 30;
    long d = c;
    System.out.println(d);

    float e = 20.10f;
    double f = e;
    System.out.println(f);

    char g = '7';
    int h = g;
    System.out.println(h);

    System.out.println();

    // Explicit (reverse the above):
    short i = 20;
    byte j;
    j = (byte)i;
    System.out.println(j);

    long k = 30;
    int l;
    l = (int)k;
    System.out.println(l);

    double m = 20.10;
    float n;
    n = (float)m;
    System.out.println(n);

    int o = 7;
    char p;
    p = (char)o;
    System.out.println(p);


    // Wrapper Classes
    Byte newByte = Byte.valueOf((byte)1);

    System.out.println(newByte);
    
  }
  
}
