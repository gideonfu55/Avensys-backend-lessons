package com.demo.learnspringframework.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.learnspringframework.game")
public class GamingApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GamingApplication.class)) 
		{
			context.getBean(GameRunner.class).run();
		} 
		catch (BeansException e) 
		{
			e.printStackTrace();
		}
	}
}