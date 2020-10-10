package com.kvtsoft.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// comparing the object reference
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same location: " + result);

		System.out.println("\nMemory location of theCoach: " + theCoach);
		System.out.println("\nMemory location of alphaCoach: " + alphaCoach);

		// close the context
		context.close();
	}

}