package com.demo.springboot.todolist.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
