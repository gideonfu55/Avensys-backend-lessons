package com.demo.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private static List<Todo> todos = new ArrayList<>();

  static {
    todos.add(new Todo(1, "Tony Stark", "Make new arc reactor", LocalDate.now().plusYears(1), false));

    todos.add(new Todo(2, "Bruce Wayne", "Save Gotham", LocalDate.now().plusYears(20), false));

    todos.add(new Todo(2, "Bruce Wayne", "Save Gotham", LocalDate.now().plusYears(20), false));
  }

  public List<Todo> findByUsername(String username) {
    return todos.stream()
      .filter(todo -> todo.getUsername().equals(username))
      .collect(Collectors.toList());
  }

}