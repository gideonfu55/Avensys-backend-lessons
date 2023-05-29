package com.demo.learnjpaandhibernate.student;

public class Student {

  private Long id;
  private String name;
  private String address;

  public Student() {
  }

  public Student(Long id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
