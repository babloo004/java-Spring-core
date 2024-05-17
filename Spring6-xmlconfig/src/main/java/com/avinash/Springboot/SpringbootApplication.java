package com.avinash.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//In SpringFramework the process is different, unlike in SpringBoot the process becomes difficult
//In SpringFrame work, we are having two approaches for configuring IoC container
//1. Configuration through xml file  2. Configuration through java Annotations
//in this module lets have a look at the Xml file Configuration
//for that we need to create an XML file in the resources folder
//so let's create a xml called "spring.xml" in resources folder

//in Spring core Project we don't need this annotation "@SpringBootApplication"
//@SpringBootApplication

public class SpringbootApplication {

	public static void main(String[] args) {
		//in Spring core framework also we need to apply getBean() method, to fetch object from container
		//but we will use "ClassPathXmlApplicationContext()" object which will gives "ApplicationContext" object
		//"ClassPathXmlApplicationContext()" constructor will accept xml file location path as string
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj1 = context.getBean("alien",Alien.class);
		//the name attribute refers to the name of class
		//it refers to the xml file and fetches the referred object
		//here name must be equal to the bean id attribute

		//we do Dependency Injection in the xml file
		obj1.getAge();
		obj1.getName();
		obj1.compile();

		//for more detailed explanation go to "spring.xml" file
	}

}
