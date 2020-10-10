package com.kvtsoft.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "run 5k hard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("Trackcoach: inside doMyStartUpStuff method");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("Trackcoach: inside doMyCleanUpStuff method");
	}
	
}
