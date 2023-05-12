package com.java.objects.classes.abstraction;

// This is a purely abstract class.
// 1. An abstract Parent class can have an abstract Child class.
abstract class Bird { 
  abstract public void fly();
  abstract public void eat();
}

// This is an impure abstract class.
// - 
abstract class Eagle extends Bird {
  public void fly() {
    System.out.println("The eagle flies at a high altitude.");
  }
}

abstract class Sparrow extends Bird {
  public void fly() {
    System.out.println("The sparrow flies at a low altitude.");
  }
}

// An abstract class can have a concrete class as a child.
class GoldenEagle extends Eagle {
  public void eat() {
    System.out.println("Golden eagle hunts and eats fishes.");
  }
}

class SerpentEagle extends Eagle {
  public void eat() {
    System.out.println("Serpent Eagle hunts and eats snakes.");
  }
}

class SwanSparrow extends Sparrow {
  public void eat() {
    System.out.println("The Swan Sparrow eats insects.");
  }
}

class WhiteSparrow extends Sparrow {
  public void eat() {
    System.out.println("The White Sparrow eats grains");
  }
}

class Sky {
  public void acceptBirds (Bird bird) {
    bird.fly();
    bird.eat();
  }
}

public class abstractClass {
  
}
