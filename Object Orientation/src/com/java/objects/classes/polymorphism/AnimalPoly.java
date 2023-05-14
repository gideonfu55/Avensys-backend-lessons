package com.java.objects.classes.polymorphism;
class Animal {
  public void eat() {
    System.out.println("Animal is eating.");
  }

  public void sleep() {
    System.out.println("Animal is sleeping.");
  }
}

class Tiger extends Animal {
  public void eat() {
    System.out.println("Tiger is eating meat.");
  }

  public void sleep() {
    System.out.println("Tiger is sleeping in a den.");
  }
}

class Lion extends Animal {
  public void eat() {
    System.out.println("Lion is eating meat.");
  }

  public void sleep() {
    System.out.println("Lion is sleeping in a cave.");
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("Dog is chewing a bone.");
  }

  public void sleep() {
    System.out.println("Dog is sleeping in a kennel.");
  }
}

class Forest {
  public void acceptAnimal(Animal animal) {
    animal.eat();
    animal.sleep();
  }
}

public class AnimalPoly {
  public static void main(String[] args) {
    Tiger tiger1 = new Tiger();
    Lion lion1 = new Lion();
    Dog dog1 = new Dog();
    Forest amazon = new Forest();
    amazon.acceptAnimal(tiger1);
    amazon.acceptAnimal(lion1);
    amazon.acceptAnimal(dog1);
  }
}
