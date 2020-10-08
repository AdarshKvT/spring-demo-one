package com.kvtsoft.springdemo;

public class FortuneServiceImp implements FortuneService {

	@Override
	public String getFortune() {
		String fortune = "Today is your lucky day!!";
		return fortune;
	}

}
