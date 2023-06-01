package com.demo.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  
  @RequestMapping("todolist")
  public String listAllTodos(ModelMap model, @SessionAttribute String name) {
    List<Todo> todos = todoService.findByUsername(name);
    model.addAttribute("todos", todos);
    return "todolist";
  }

  // Go to Add Todo Page
  @RequestMapping(value = "add-todo", method = RequestMethod.GET)
  public String showNewTodoPage() {
    return "todo";
  }

  // Adding a new todo
  @RequestMapping(value = "add-todo", method = RequestMethod.POST)
  public String addNewTodo(ModelMap model, Todo todo) {
    String username = (String)model.get("name");
    todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
    return "redirect:todolist";
  }

}
