package com.demo.springboot.todolist.controller.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentWelcomeController {
  
  @RequestMapping("avensys")
  public String welcome(@RequestParam String traineeName, ModelMap model) {
    model.put("traineeName", traineeName);
    return "welcome";
  }

}
