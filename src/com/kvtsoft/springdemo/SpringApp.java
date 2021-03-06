package com.kvtsoft.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
	
		// call the method on the bean
		String dailyWorkout = theCoach.getDailyWorkout();
		System.out.println(dailyWorkout);

		// get the fortune from the bean as fortune(helper/dependency) is injected by
		// spring for us
		String dailyFortune = theCoach.getDailyFortune();
		System.out.println(dailyFortune);

		// close the context
		context.close();
	}
}
