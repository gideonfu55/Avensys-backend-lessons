package com.java.objects.classes;

public class Student {

  String name;
  int age;
  float marks;

  public Student(String name, int age, float marks) {
    this.name = name;
    this.age = age;
    this.marks = marks;
  }

  public void play() {
    System.out.println("Student is having fun.");
  }

  public void read(String book) {
    System.out.println("Student is reading " + book + " in the classroom.");
  }

  public void eat(String food) {
    System.out.println("Student is eating " + food + " at the canteen.");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public float getMarks() {
    return this.marks;
  }

  public void setMarks(float marks) {
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", age='" + getAge() + "'" +
      ", marks='" + getMarks() + "'" +
      "}";
  }


}
