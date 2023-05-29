package com.java.learnspringframework.DataProviderAssignment;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.java.learnspringframework.DataProviderAssignment")
public class BusinessCalculatorApp {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(BusinessCalculatorApp.class)) {
      System.out.println("The max value returned is: " + context.getBean(BusinessCalculator.class).findMaxValue());
    } catch (BeansException e) {
      e.printStackTrace();
    }
  }
}
