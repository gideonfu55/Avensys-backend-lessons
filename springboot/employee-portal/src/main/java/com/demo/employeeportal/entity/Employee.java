package com.demo.employeeportal.entity;

import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "address")
  @Size(min = 5, message = "Enter at least 5 characters for address.")
  private String address;

  @Column(name = "title")
  @Size(min = 5, message = "Enter at least 5 characters for title.")
  private String title;

  @Column(name = "salary")
  @Min(value = 1500, message = "Salary must meet minimum wage requirement of $1,500.00.")
  @NumberFormat(pattern = "#0.00")
  private double salary;

  public Employee() {
    // Default constructor
  }

  public Employee(String name, String address, String title, double salary) {
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
