package com.java.objects.accessmodifier;

class Parent {
  public void greet() {
    System.out.println("Hello everyone from parent!");
  }

}

class Child extends Parent {
  // Child's method can only be of a higher visibility than parent's:
  public void greet() {
    System.out.println("Hello everyone from child!");
  }
}

public class AccessModifier {
  // Access modifiers order of visibility:
  // public > default > protected > private
}
