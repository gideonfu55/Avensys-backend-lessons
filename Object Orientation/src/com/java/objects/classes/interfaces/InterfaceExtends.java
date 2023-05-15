package com.java.objects.classes.interfaces;

//9. One interface can extends another interface
interface Calculator3 {
  public void mul();
  public void div();
}

interface Calculator4 extends Calculator3 {
  public void add();
  public void sub();
}

public class InterfaceExtends {
  public static void main(String[] args) {
    
  }
}
