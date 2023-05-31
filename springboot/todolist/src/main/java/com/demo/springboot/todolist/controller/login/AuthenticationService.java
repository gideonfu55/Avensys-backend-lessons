package com.demo.springboot.todolist.controller.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
  public boolean authenticateUser (String username, String password) {

    boolean isValidUsername = username.equalsIgnoreCase("Gideon");
    boolean isValidPassword = password.equals("password123");
    
    return isValidUsername && isValidPassword;
  }
}
