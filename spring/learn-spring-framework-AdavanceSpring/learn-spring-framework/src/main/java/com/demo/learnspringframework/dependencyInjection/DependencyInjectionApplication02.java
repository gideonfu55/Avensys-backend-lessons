package com.demo.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//Java Class // Dependency Injection using Setters 
//CustomerOne
//CustomerTwo

//@Component
class JavaClass
{
	
	StudentOne studentOne;
	
	StudentTwo studentTwo;
	
	@Autowired
	public void setStudentOne(StudentOne studentOne) {
		System.out.println("Stter Injection - setStudentOne Dependency");
		this.studentOne = studentOne;
	}
	
	@Autowired
	public void setStudentTwo(StudentTwo studentTwo) {
		System.out.println("Stter Injection - setStudentTwo Dependency");
		this.studentTwo = studentTwo;
	}

	public String toString()
	{
		return "Using " + studentOne + " and " + studentTwo + " Dependencies";
	}
}

//@Component
class StudentOne
{
	
}

//@Component
class StudentTwo
{
	
}
@Configuration
@ComponentScan
public class DependencyInjectionApplication02 {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext(DependencyInjectionApplication02.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(JavaClass.class));
			
		}
	}
}