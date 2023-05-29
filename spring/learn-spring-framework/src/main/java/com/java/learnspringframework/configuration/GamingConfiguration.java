package com.java.learnspringframework.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.learnspringframework.componentBasic.game.Game;
import com.java.learnspringframework.componentBasic.game.MarioGame;
import com.java.learnspringframework.componentBasic.gameconsole.GameConsole;

@Configuration
public class GamingConfiguration {
  
  // @Bean
  // public Game game() {
  //   MarioGame marioGame = new MarioGame();
  //   return marioGame;
  // }

  // @Bean
  // public GameConsole gameConsole(Game game) {
  //   GameConsole gameConsole = new GameConsole(game);
  //   return gameConsole;
  //}
}
