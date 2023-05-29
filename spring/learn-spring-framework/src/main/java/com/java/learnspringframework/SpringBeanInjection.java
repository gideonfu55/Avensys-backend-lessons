package com.java.learnspringframework;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import com.java.learnspringframework.configuration.Address;
import com.java.learnspringframework.configuration.HelloWorldConfiguration;

public class SpringBeanInjection {
  public static void main(String[] args) {

    try (
      // 1: Launch the Spring Context
      var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
      // 2. HelloWorldConfiguration.java
      // 3. Retreive the beans which is managed by Spring:
      System.out.println(context.getBean("name"));
      System.out.println(context.getBean("age"));
      System.out.println(context.getBean("studentAddress"));
      // System.out.println(context.getBean(Address.class));
      System.out.println(context.getBean("student"));

      System.out.println(context.getBeanDefinitionCount());
      Arrays.stream(context.getBeanDefinitionNames()).forEach(x -> {
        System.out.println(x);
      });
    } catch (BeansException e) {
      e.printStackTrace();
    }
  }
}
