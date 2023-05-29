package com.demo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GamingConsole {

  public void up() {
    System.out.println("Move up and eat power cookie.");
  }

  public void down() {
    System.out.println("Move down and eat cookie.");
  }

  public void left() {
    System.out.println("Move left and eat a ghost.");
  }

  public void right() {
    System.out.println("Move right to evade a ghost.");
  }
  
}
