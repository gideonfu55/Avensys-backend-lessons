package com.demo.employeeportal;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.employeeportal.entity.Todo;
import com.demo.employeeportal.repository.TodoRepository;


@Component
public class TodoCommandLineRunner implements CommandLineRunner {

  private TodoRepository todoRepository;

  public TodoCommandLineRunner(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("JaneLim", "Manage todolist project", LocalDate.now().plusDays(1), false));
    todoRepository.save(new Todo("MuhammadAli", "Become boxing champ", LocalDate.now().plusYears(1), false));
    todoRepository.save(new Todo("JohnDoe", "Complete Todolist and Employee Portal App", LocalDate.now().plusDays(2), false));;
  }
  
}
