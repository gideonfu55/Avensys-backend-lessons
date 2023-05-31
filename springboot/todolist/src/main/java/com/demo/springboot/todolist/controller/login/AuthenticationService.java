package com.demo.springboot.todolist.controller.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

  private Map<String, String> validUsers;

  public AuthenticationService() {
    // Initialize the map with valid usernames and passwords
    validUsers = new HashMap<>();
    validUsers.put("Gideon", "password123");
    validUsers.put("brucewayne", "iambatman");
    validUsers.put("tonystark", "iamironman");
    // Add more valid users as needed
  }

  public boolean authenticateUser (String username, String password) {

    String validPassword = validUsers.get(username);
    return validPassword != null && validPassword.equals(password);
  }
}
