package com.kvtsoft.beanscope;

public class GulfCoach implements Coach {

	// define field
	private FortuneService fortuneService;

	// define constructor for class constructor injection
	public GulfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;

	}

	// default constructor with no-agr
	public GulfCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkOut() {
		return "Spends about three to four hours concentrating on the full swing";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
