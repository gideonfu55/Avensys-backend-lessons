package com.demo.employeeportal.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

  private Map<String, String> validAdmin;
  private Map<String, String> validEmployee;

  public AuthenticationService() {
    // Initialize the map with valid usernames and password
    // Administrators:
    validAdmin = new HashMap<>();
    validAdmin.put("Gideon", "password123");
    validAdmin.put("brucewayne", "iambatman");
    validAdmin.put("tonystark", "iamironman");
    // Employees:
    validEmployee = new HashMap<>();
    validEmployee.put("MuhammadAli", "muhammadali");
    validEmployee.put("JohnDoe", "johndoe");
    validEmployee.put("JaneLim", "janelim");
  }

  public boolean authenticateAdmin (String username, String password) {
    String validPassword = validAdmin.get(username);
    return validPassword != null && validPassword.equals(password);
  }

  public boolean authenticateEmployee(String username, String password) {
    String validPassword = validEmployee.get(username);
    return validPassword != null && validPassword.equals(password);
  }
}
