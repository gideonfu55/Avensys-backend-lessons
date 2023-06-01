package com.demo.employeeportal.employee;

public class Employee {
  
  private Long id;
  private String name;
  private String address;
  private String title;
  private double salary;

  public Employee(Long id, String name, String address, String title, double salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.title = title;
    this.salary = salary;
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

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", address='" + getAddress() + "'" +
      ", title='" + getTitle() + "'" +
      ", salary='" + getSalary() + "'" +
      "}";
  }

}
