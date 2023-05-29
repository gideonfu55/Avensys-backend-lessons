package com.demo.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.learnspringboot.pojo.Student;

@RestController
public class StudentController {
  
  // This allows you to retrieve the following list on localhost:8080/students:
  @RequestMapping("/students")
  public List<Student> retreiveStudents() {
    return Arrays.asList(
      new Student("0001", "Bruce Wayne", 25, "Gotham City", "MIT01"),
      new Student("0002", "Tony Stark", 23, "New York", "MIT01"),
      new Student("0003", "Peter Parker", 20, "New York", "MIT01")
    );
  }

}
