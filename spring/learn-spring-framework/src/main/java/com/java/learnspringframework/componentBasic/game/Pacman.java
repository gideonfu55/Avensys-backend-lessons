package com.java.learnspringframework.componentBasic.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class Pacman extends Game {
  
  private static String name = "Pacman";

  public Pacman() {
    super(name);
  }

  public void up() {
    System.out.println("Move up and eat a cookie.");
  }

  public void down() {
    System.out.println("Move down to eat a power cookie.");
  }

  public void left() {
    System.out.println("Move left to eat a ghost.");
  }

  public void right() {
    System.out.println("Power ended. Move right to evade a ghost.");
  }

  
  
}
