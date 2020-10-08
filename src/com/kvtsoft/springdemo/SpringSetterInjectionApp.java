package com.kvtsoft.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSetterInjectionApp {

	public static void main(String[] args) {

		// load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);

		// call methods on the bean
		String dailyWOrkout = theCoach.getDailyWorkout();
		System.out.println(dailyWOrkout);

		String dailyFortune = theCoach.getDailyFortune();
		System.out.println(dailyFortune);

		String team = theCoach.getTeam();
		System.out.println(team);

		String emailAddress = theCoach.getEmailAddress();
		System.out.println(emailAddress);

		// close the context
		context.close();
	}

}
