package com.java.objects.classes.abstraction;

abstract class AnimalTwo {
  abstract public void eat();
  abstract public void sleep();
}

abstract class LionTwo extends AnimalTwo {
  public void eat() {
    System.out.println("The lion eats meat.");
  }
}

abstract class DogTwo extends AnimalTwo {
  public void eat() {
    System.out.println("The dog chews bone.");
  }
}

class NorthernLion extends LionTwo {
  public void sleep() {
    System.out.println("The Northern Lion sleeps in a northern cave.");
  }
}

class SouthernLion extends LionTwo {
  public void sleep() {
    System.out.println("The Southern Lion sleeps in a southern cave.");
  }
}

class BullDog extends DogTwo {
  public void sleep() {
    System.out.println("The Bull Dog sleeps on his owner's bed.");
  }
}

class Dalmatian extends DogTwo {
  public void sleep() {
    System.out.println("The Dalmatian sleeps in a kennel.");
  }
}

class Outdoors {
  public void acceptAnimal(AnimalTwo animal) {
    animal.eat();
    animal.sleep();
  }
}

public class AnimalAbstract {
  public static void main(String[] args) {
    NorthernLion n1 = new NorthernLion();
    SouthernLion s1 = new SouthernLion();
    BullDog b1 = new BullDog();
    Dalmatian d1 = new Dalmatian();

    Outdoors outdoor = new Outdoors();
    outdoor.acceptAnimal(n1);
    outdoor.acceptAnimal(s1);
    outdoor.acceptAnimal(b1);
    outdoor.acceptAnimal(d1);

  }
}
