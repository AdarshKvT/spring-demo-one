package com.kvtsoft.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new BaseballCoach();
		//Coach theCoach = new TrackCoach();
		String daillyWorkOut = theCoach.getDailyWorkout();

		// use the object
		System.out.println(daillyWorkOut);
	}
}
 