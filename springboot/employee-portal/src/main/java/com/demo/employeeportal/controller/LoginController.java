package com.demo.employeeportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.employeeportal.service.AuthenticationService;

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

  // Login Authentication for Welcome Page
  @RequestMapping(value = "login", method = RequestMethod.POST)
  public String loginToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
    if (authenticationService.authenticateUser(name, password)) {
      model.put("name", name);
      return "welcome";
    }
    
    model.put("errorMessage", "Invalid credentials. Please try again.");
    return "login";
  }

}
