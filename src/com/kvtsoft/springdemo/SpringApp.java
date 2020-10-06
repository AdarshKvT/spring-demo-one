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

		// close the context
		context.close();
	}
}
