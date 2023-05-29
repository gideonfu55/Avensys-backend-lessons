package com.java.learnspringframework.beanscopes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // without scope: it follows a Singleton Design Pattern - only one container reference for all object instances
class GeneralClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Multiple container references for different object instances
@Component
class PrototypeClass {
  
}

@Configuration
@ComponentScan()
public class SpringBeansScopeApplication {
  public static void main(String[] args) {
    try (
      var context = new AnnotationConfigApplicationContext(SpringBeansScopeApplication.class)
      ) {
      System.out.println(context.getBean(GeneralClass.class));
      System.out.println(context.getBean(GeneralClass.class));
      System.out.println(context.getBean(PrototypeClass.class));
      System.out.println(context.getBean(PrototypeClass.class));
    } catch (BeansException e) {
      e.printStackTrace();
    }
  }
}
