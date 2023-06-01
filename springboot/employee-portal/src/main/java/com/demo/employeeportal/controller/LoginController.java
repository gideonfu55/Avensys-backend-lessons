package com.demo.employeeportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.employeeportal.service.AuthenticationService;

@Controller
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

}
