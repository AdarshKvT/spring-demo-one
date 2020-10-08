package com.kvtsoft.springdemo;

public class CricketCoach implements Coach {

	// define private field
	private FortuneService fortuneService;

	// define constructor for dependency injection
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	// default constructor
	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Practice straight drive for 20 minutes";
	}

	@Override
	public String getDailyFortune() {

		// use my fortuneService to get fortune
		String dailyFortune = "Keep going... " + fortuneService.getFortune();
		return dailyFortune;
	}

}
