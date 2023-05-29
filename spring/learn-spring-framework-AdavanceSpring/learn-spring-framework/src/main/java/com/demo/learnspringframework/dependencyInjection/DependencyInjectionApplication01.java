package com.demo.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//SuperMarket // Dependency Injection using fields 
//CustomerOne
//CustomerTwo

//@Component - UnComment it
class SuperMarket
{
	@Autowired
	CustomerOne customerOne;
	
	@Autowired
	CustomerTwo customerTwo;
	
	public String toString()
	{
		return "Using " + customerOne + " and " + customerTwo + " Dependencies";
	}
}

//@Component
class CustomerOne
{
	
}

//@Component
class CustomerTwo
{
	
}
@Configuration
@ComponentScan
public class DependencyInjectionApplication01 {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionApplication01.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(SuperMarket.class));
			
		}
	}
}