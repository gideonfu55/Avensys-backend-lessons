package com.demo.springboot.todolist.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {
  
  private int id;
  private String username;

  @Size(min = 10, message = "Enter at least 10 characters for description.")
  private String description;
  
  private LocalDate targetDate;
  private boolean done;

  public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
    this.id = id;
    this.username = username;
    this.description = description;
    this.targetDate = targetDate;
    this.done = done;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
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
