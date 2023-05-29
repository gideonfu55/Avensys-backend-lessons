package com.demo.learnspringframework.lazyIntialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // Eager Initialization
class DemoOne
{
	
}

@Component
@Lazy // Lazy Initialization
class DemoTwo
{
	private DemoOne demoOne;
	
	public DemoTwo(DemoOne demoOne)
	{
		// I want some  criteria logic to be executed even before the initialization
		System.out.println("Some Intialization Code");
		this.demoOne = demoOne;
	}
	
	public void display()
	{
		System.out.println("Displaying Something about the DemoTwo Class");
	}
}

@Configuration
@ComponentScan
public class LazyIntializationApplication {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(LazyIntializationApplication.class)) {
			System.out.println("Initalization of the Context is Completed");
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			context.getBean(DemoTwo.class).display();
			
		}
	
	}
}