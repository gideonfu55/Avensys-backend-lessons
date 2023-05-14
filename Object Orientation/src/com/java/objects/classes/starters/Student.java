package com.java.objects.classes.starters;

public class Student {

  private String name;
  private int age;
  private float marks;
  private String city;

  public Student() {
    
  }

  public Student(String name, int age, float marks, String city) {
    this.name = name;
    this.age = age;
    this.marks = marks;
    this.city = city;
  }

  public Student(String name, float marks) {
    this.name = name;
    this.marks = marks;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name, String city) {
    this.name = name;
    this.city = city;
  }

  public Student(String name) {
    this.name = name;
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

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
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
