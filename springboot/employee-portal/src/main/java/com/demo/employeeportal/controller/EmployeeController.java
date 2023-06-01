package com.demo.employeeportal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.employeeportal.entity.Employee;
import com.demo.employeeportal.service.EmployeeService;

@Controller
@SessionAttributes("name")
public class EmployeeController {
  
  private EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  // Display Employee Page and list all employees:
  @RequestMapping("employeelist")
  public String listAllEmployees(ModelMap model) {
    List<Employee> employees = employeeService.findAllEmployees();
    model.addAttribute("employees", employees);
    return "employeelist";
  }

  // Go to Add Employee Page:
  @RequestMapping(value = "add-employee", method = RequestMethod.GET)
  public String showNewEmployeePage(ModelMap model) {
    Employee employee = new Employee(null, null, null, 0);
    model.put("employee", employee);
    return "employee";
  } 

}
