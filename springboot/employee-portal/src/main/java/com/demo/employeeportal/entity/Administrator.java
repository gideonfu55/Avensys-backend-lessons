package com.demo.employeeportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrator")
public class Administrator {
  
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "username")
  private String username;

  @Column(name = "role")
  private String role;

  public Administrator() {
  }

  public Administrator(Long id, String username, String role) {
    this.id = id;
    this.username = username;
    this.role = role;
  }
  
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }
  
  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", username='" + getUsername() + "'" +
      ", role='" + getRole() + "'" +
      "}";
  }

}
