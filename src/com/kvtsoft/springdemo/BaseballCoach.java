package com.kvtsoft.springdemo;

public class BaseballCoach implements Coach {

	// define private field for the dependency
	private FortuneService fortuneService;

	// define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public BaseballCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {

		// use my fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
