package com.demo.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	
	public void up()
	{
		System.out.println("Up");
	}
	
	public void down()
	{
		System.out.println("Sit Down");
	}
	
	public void left()
	{
		System.out.println("Going back");
	}
	
	public void right()
	{
		System.out.println("Shooting a bullet");
	}

}
