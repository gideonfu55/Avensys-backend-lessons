package com.demo.learnspringframework.postandpre;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class NormalClass
{
	private Dependency dependency;

	public NormalClass(Dependency dependency) {
		super();
		this.dependency = dependency;
		System.out.println("All Dependencies are Ready!!!!!");
	}
	
	@PostConstruct // after construction of beans
	public void initialize()
	{
		dependency.getReady();
	}
	
	@PreDestroy // before you destroy the beans
	public void cleanUp()
	{
		dependency.cleanup();
	}
	
}

@Component
class Dependency
{
	public void getReady()
	{
		System.out.println("Some Logic using Dependency ");
	}
	
	
	public void cleanup()
	{
		System.out.println("Clean Up the beans");
	}
}
@Configuration
@ComponentScan
public class PrePosAnnotationsApplication {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(PrePosAnnotationsApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
		}
	}
}