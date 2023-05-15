package com.java.objects.classes.interfaces;

//9. After implementing interface we can provide partial implementation but the class has ot be declared as abstract
interface Calculator1 {
  public void mul();
  public void div();
}

abstract class MyCalc implements Calculator1 {
  public void mul() {

  }
}

public class InterfaceAbstract {
  
}
