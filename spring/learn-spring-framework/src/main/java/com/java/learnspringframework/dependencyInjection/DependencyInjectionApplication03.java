package com.java.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Football {

  PlayerOne playerOne;
  PlayerTwo playerTwo;

  // You can opt to autowire or not. It is not required. Having a constructor leads to the injection by default:
  public Football(PlayerOne playerOne, PlayerTwo playerTwo) {
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;
  }

  public String toString() {
    return "Using " + playerOne + " and " + playerTwo + " as dependencies.";
  }
}

@Component
class PlayerOne {
  
}

@Component
class PlayerTwo {

}

@Configuration
@ComponentScan(basePackageClasses = Football.class)
public class DependencyInjectionApplication03 {
  public static void main(String[] args) {

    try (
      var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication03.class)
      ) {
        Football football = context.getBean(Football.class);

        Arrays.stream(football.getClass().getDeclaredFields())
          .filter(field -> context.getBeanNamesForType(field.getType()).length > 0)
          .forEach(field -> {
            String dependencyName = context.getBeanNamesForType(field.getType())[0];
            System.out.println(dependencyName);
          });

        System.out.println(context.getBean(Football.class).toString());
      }
    catch (BeansException e) {
      e.printStackTrace();
    }
  }
}
