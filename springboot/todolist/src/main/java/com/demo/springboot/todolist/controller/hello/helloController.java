package com.demo.springboot.todolist.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
  
  @RequestMapping("hello/{name}")
  @ResponseBody
  public String hello(@PathVariable("name") String name) {
    return "Hi " + name + "! Welcome to your first web application!";
  }

  // Return HTML (just to show - this is bad):
  @RequestMapping("hello-html")
  @ResponseBody
  public String helloHtml() {
    StringBuffer sb = new StringBuffer();
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<title>My First HTML Page</title>");
    sb.append("</head>");
    sb.append("<body>");
    sb.append("<h1>Hey Team! Welcome to learn your first web application.</h1>");
    sb.append("<h3>You are going to make a todolist app!</h3>");
    sb.append("</body>");
    sb.append("</html>");

    return sb.toString();
  }

  @RequestMapping("hello-jsp")
  public String helloJsp() {
    return "hello";
  }

}
