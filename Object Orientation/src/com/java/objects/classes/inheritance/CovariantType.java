package com.java.objects.classes.inheritance;

class Animal {

}

class Tiger extends Animal {

}

class TigerMum {
  public Animal tigerCreation() {
    Animal a = new Animal();
    return a;
  }
}

class TigerKid {
  public Tiger tigerCreation() {
    Tiger t = new Tiger();
    return t;
  }
}

public class CovariantType {
  
}
