package com.demo.employeeportal.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.entity.Todo;

import jakarta.validation.Valid;

@Service
public class TodoService {

  



  public List<Todo> findByUsername(String username) {
    return todos.stream()
      .filter(todo -> todo.getUsername().equals(username))
      .collect(Collectors.toList());
  }

  public Todo findById(int id) {
    Predicate<? super Todo> predicate = todo -> todo.getId() == id;
    Todo todo = todos.stream().filter(predicate).findFirst().get();
    return todo;
  }

  public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
    Todo todo = new Todo(++todoCount, username, description, targetDate, done);
    todos.add(todo);
  }

  public void deleteTodoById(int id) {
    Predicate<? super Todo> predicate = todo -> todo.getId() == id;
    todos.removeIf(predicate);
  }

  public void updateTodo(@Valid Todo todo) {
    deleteTodoById(todo.getId());
    todos.add(todo);
  }

}