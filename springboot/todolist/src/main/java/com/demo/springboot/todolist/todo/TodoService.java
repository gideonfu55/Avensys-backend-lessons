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
    todos.add(new Todo(1, "Gideon", "Make a todolist webapp", LocalDate.now().plusDays(1), true));

    todos.add(new Todo(2, "brucewayne", "Save Gotham", LocalDate.now().plusYears(20), false));

    todos.add(new Todo(3, "tonystark", "Build new Arc Reactor", LocalDate.now().plusYears(1), false));

    todos.add(new Todo(4, "Gideon", "Get a tech job", LocalDate.now().plusMonths(1), false));
  }

  public List<Todo> findByUsername(String username) {
    return todos.stream()
      .filter(todo -> todo.getUsername().equals(username))
      .collect(Collectors.toList());
  }

}