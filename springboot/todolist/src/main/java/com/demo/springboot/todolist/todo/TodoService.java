package com.demo.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {

  private static List<Todo> todos;

  static {
    todos.add(new Todo(1, "Tony Stark", "Make new arc reactor", LocalDate.now().plusYears(1), false));

    todos.add(new Todo(2, "Bruce Wayne", "Save Gotham", LocalDate.now().plusYears(20), false));

    todos.add(new Todo(2, "Bruce Wayne", "Save Gotham", LocalDate.now().plusYears(20), false));
  }

}