package com.java.learnspringframework.XML;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigurationContextApplication {
  public static void main(String[] args) {
    try (
      var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")
      ) {
      System.out.println(context.getBean("MarioGame"));
    } catch (BeansException e) {
      e.printStackTrace();
    }

  }
}
