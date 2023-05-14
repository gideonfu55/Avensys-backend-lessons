package com.java.objects.classes.starters;

public class Bird {
  String name;
  String type;
  String color;

  public Bird(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }
 
  public void chirp() {
    System.out.println(name + " bird is chirping.");
  }

  public void fly() {
    System.out.println(name + " bird likes to fly.");
  }

  public void peck(String food) {
    System.out.println(name + " bird is pecking on " + food + ".");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", type='" + getType() + "'" +
      ", color='" + getColor() + "'" +
      "}";
  }
  
}
