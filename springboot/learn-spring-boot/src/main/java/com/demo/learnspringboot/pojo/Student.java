package com.demo.learnspringboot.pojo;

public class Student {

  private String id;
  private String name;
  private int age;
  private String location;
  private String classroom;

  public Student(String id, String name, int age, String location, String classroom) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.location = location;
    this.classroom = classroom;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getClassroom() {
    return this.classroom;
  }

  public void setClassroom(String classroom) {
    this.classroom = classroom;
  }
  
}
