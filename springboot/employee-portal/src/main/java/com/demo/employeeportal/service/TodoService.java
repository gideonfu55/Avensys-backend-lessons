package com.demo.employeeportal.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.entity.Todo;
import com.demo.employeeportal.repository.TodoRepository;

import jakarta.validation.Valid;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
    Todo todo = new Todo(username, description, targetDate, done);
    todoRepository.save(todo);
  }

  public List<Todo> findTodosByUsername(String username) {
    return todoRepository.findAllByUsername(username);
  }

  public Optional<Todo> findById(Long id) {
    return todoRepository.findById(id);
  }

  public void updateTodo(@Valid Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodoById(Long id) {
    todoRepository.deleteById(id);
  }

}