package com.demo.springboot.todolist.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

  private AuthenticationService authenticationService;

  public LoginController(AuthenticationService authenticationService) {
    super();
    this.authenticationService = authenticationService;
  }

  @RequestMapping(value = "login", method = RequestMethod.GET)
  public String gotologinPage() {
    return "login";
  }

  // Login Authentication for Welcome Page:
  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
    if (authenticationService.authenticateUser(name, password)) {
      model.put("name", name);
      return "welcome";
    }
    model.put("errorMessage", "Invalid credentials. Please try again.");
    return "login";
  }

  @RequestMapping("logout/{name}")
  public String logout(@PathVariable("name") String name, Model model) {
    model.addAttribute("name", name);
    return "logout";
  }

}

// @RequestMapping("logouttwo/{name}")
// public String logoutTwo(@PathVariable("name") String name, ModelMap model) {
// model.put("name", name);
// return "logout";
// }