package com.demo.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
// Dependency Injection using Constructors 

@Component
class Football
{
	
	PlayerOne playerOne;
	
	PlayerTwo playerTwo;
	
	@Autowired
	public Football(PlayerOne playerOne, PlayerTwo playerTwo) {
		super();
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public String toString()
	{
		return "Using " + playerOne + " and " + playerTwo + " Dependencies";
	}
}

@Component
class PlayerOne
{
	
}

@Component
class PlayerTwo
{
	
}
@Configuration
@ComponentScan
public class DependencyInjectionApplication03 {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionApplication03.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(Football.class));
			
		}
	}
}