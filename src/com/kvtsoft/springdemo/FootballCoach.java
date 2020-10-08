package com.kvtsoft.springdemo;

public class FootballCoach implements Coach {

	// defining fields
	private FortuneService fortuneService;

	// adding more fields for lite4ral value injection
	private String emailAddress;
	private String team;

	// create a no-arg constructor default constructor
	public FootballCoach() {
		System.out.println("FootballCoach: inside no-arg constructor");
	}

	// generating getter and setter
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("FootballCoach: inside setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("FootballCoach: inside setTeam method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 10 laps within 3 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
}
