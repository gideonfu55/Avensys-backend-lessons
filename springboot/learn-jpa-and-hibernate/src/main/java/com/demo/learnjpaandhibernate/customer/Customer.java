package com.demo.learnjpaandhibernate.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

  @Id
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  public Customer() {
  }

  public Customer(Long id, String name, String address) {
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

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", address='" + getAddress() + "'" +
      "}";
  }

}
