package com.demo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier") // It has the highest priority then @Primary
public class MarioGame implements GamingConsole{
	
	public void up()
	{
		System.out.println("Jumping");
	}
	
	public void down()
	{
		System.out.println("Going into a hole");
	}
	
	public void left()
	{
		System.out.println("Going back");
	}
	
	public void right()
	{
		System.out.println("Accelertaing");
	}

}
