package com.demo.employeeportal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.employeeportal.entity.Employee;
import com.demo.employeeportal.service.EmployeeService;

import jakarta.validation.Valid;

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

  // Adding a new employee:
  @RequestMapping(value = "add-employee", method = RequestMethod.POST)
  public String addNewTodo(ModelMap model, @Valid Employee employee, BindingResult result) {

    if (result.hasErrors()) {
      return "employee";
    }

    employeeService.addEmployee(employee.getName(), employee.getAddress(), employee.getTitle(), employee.getSalary());
    return "redirect:employeelist";
  }

  // Delete an existing employee:
  @RequestMapping("delete-employee")
  public String deleteEmployee(@RequestParam Long id) {
    employeeService.deleteEmployeeById(id);
    return "redirect:employeelist";
  }

  // Update Employee - Return to Add Employee Page with existing details:
  @RequestMapping(value = "update-employee", method= RequestMethod.GET)
  public String showUpdateEmployee(@RequestParam Long id, ModelMap model) {
    Optional<Employee> employee = employeeService.findEmployeeById(id);
    model.addAttribute("employee", employee);
    return "employee";
  }

  // Update Employee - Edit current details and return to Employee List Page:
  @RequestMapping(value = "update-employee", method = RequestMethod.POST)
  public String updateEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {
    
    if (result.hasErrors()) {
      return "employee";
    }

    employeeService.updateEmployee(employee);
    return "redirect:employeelist";
  }

}
