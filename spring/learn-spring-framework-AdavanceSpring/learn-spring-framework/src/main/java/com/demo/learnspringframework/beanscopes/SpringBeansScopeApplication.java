package com.demo.learnspringframework.beanscopes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)// without scope:  Singleton Design Pattern
class GeneralClass 
{
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE) // many objects instances but it is only per Container
@Component
class PrototypeClass
{
	
}
@Configuration
@ComponentScan
public class SpringBeansScopeApplication {
	
	public static void main(String[] args) {
		
		var context = 
				new AnnotationConfigApplicationContext(SpringBeansScopeApplication.class);
		
		System.out.println(context.getBean(GeneralClass.class));
		System.out.println(context.getBean(GeneralClass.class));
		System.out.println(context.getBean(GeneralClass.class));
		System.out.println(context.getBean(GeneralClass.class));
		System.out.println(context.getBean(GeneralClass.class));
		
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		
	
			
		
		
	}
}