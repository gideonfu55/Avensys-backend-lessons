package com.demo.employeeportal.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "todo")
public class Todo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  
  @Column(name = "username")
  private String username;

  @Column(name = "description")
  @Size(min = 10, message = "Enter at least 10 characters for description.")
  private String description;

  @Column(name = "targetDate")
  @FutureOrPresent(message = "Target date for task cannot be in the past.")
  private LocalDate targetDate;

  @Column(name = "done")
  private boolean done;

  public Todo() {
  }

  public Todo(String username, String description, LocalDate targetDate, boolean done) {
    this.username = username;
    this.description = description;
    this.targetDate = targetDate;
    this.done = done;
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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getTargetDate() {
    return this.targetDate;
  }

  public void setTargetDate(LocalDate targetDate) {
    this.targetDate = targetDate;
  }

  public boolean isDone() {
    return this.done;
  }

  public boolean getDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", username='" + getUsername() + "'" +
      ", description='" + getDescription() + "'" +
      ", targetDate='" + getTargetDate() + "'" +
      ", done='" + isDone() + "'" +
      "}";
  }

}
