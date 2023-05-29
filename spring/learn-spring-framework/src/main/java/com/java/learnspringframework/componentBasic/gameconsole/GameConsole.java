package com.java.learnspringframework.componentBasic.gameconsole;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.learnspringframework.componentBasic.impl.GameRunner;
import com.java.learnspringframework.componentBasic.game.Game;

@Component
public class GameConsole implements GameRunner {

  Game game;

  public GameConsole(@Qualifier("PacmanGameQualifier")Game game) {
    this.game = game;
  }

  public void runGame() {
    System.out.println("\nRunning the game " 
    + game.getName()
    + ":\n");

    game.up();
    game.down();
    game.left();
    game.right();
    System.out.println();
  }

}
