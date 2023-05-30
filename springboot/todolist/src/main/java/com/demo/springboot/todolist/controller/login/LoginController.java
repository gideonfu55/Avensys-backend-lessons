package com.demo.springboot.todolist.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @RequestMapping("login")
  public String login() {
    return "login";
  }

  // Introducing model.addAttribute
  @RequestMapping("logout/{name}")
  public String logout(@PathVariable("name") String name, Model model) {
    model.addAttribute("name", name);
    return "logout";
  }

  // OR use ModelMap
  @RequestMapping("logouttwo/{name}")
  public String logoutTwo(@PathVariable("name") String name, ModelMap model) {
    model.put("name", name);
    return "logout";
  }

  // For request param:
  @RequestMapping("welcome")
  public String welcome(@RequestParam String traineeName, ModelMap model) {
    model.put("traineeName", traineeName);
    return "welcome";
  }
}
