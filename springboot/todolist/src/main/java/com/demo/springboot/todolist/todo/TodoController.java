package com.demo.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
  public String showNewTodoPage(ModelMap model) {
    String username = (String)model.get("name");
    Todo todo = new Todo(0, username, "", LocalDate.now(), false);
    model.put("todo", todo);
    return "todo";
  }

  // Adding a new todo:
  @RequestMapping(value = "add-todo", method = RequestMethod.POST)
  public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

    if (result.hasErrors()) {
      return "todo";
    }

    String username = (String)model.get("name");
    todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
    return "redirect:todolist";
  }

  // Deleting an existing todo:
  @RequestMapping("delete-todo")
  public String deleteTodo(@RequestParam int id) {
    todoService.deleteTodoById(id);
    return "redirect:todolist";
  }

  // Update an existing todo - returning to add todo page with existing todo details:
  @RequestMapping(value = "update-todo", method = RequestMethod.GET)
  public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
    Todo todo = todoService.findById(id);
    model.addAttribute("todo", todo);
    return "todo";
  }

  // Update an existing do - edit current details and return to todolist page:
  @RequestMapping(value = "update-todo", method = RequestMethod.POST)
  public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
    if (result.hasErrors()) {
      return "todo";
    }
    todoService.updateTodo(todo);
    return "redirect:todolist";
  }

}

// Update an existing do - edit current details and return to todolist page
// (alternative):
// @RequestMapping(value = "update-todo", method = RequestMethod.POST)
// public String updateTodo(@ModelAttribute("todo") @Valid Todo todo,
// BindingResult result, HttpSession session) {
// if (result.hasErrors()) {
// return "todo";
// }
// String username = (String)session.getAttribute("name");
// todo.setUsername(username);
// todoService.updateTodo(todo);
// return "redirect:todolist";
// }
