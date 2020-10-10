package com.kvtsoft.springdemo;

import java.util.Random;

public class FortuneServiceImp implements FortuneService {

	@Override
	public String getFortune() {

		String[] fortuneArray = { "Character consist of what you do on the third and forth tries",
				"Winner never quite and quitter never win", "You can't beat the person who won't give up" };

		Random random = new Random();
		int fortuneNum = random.nextInt(fortuneArray.length);
		// System.out.println(fortuneNum);

		String fortune = fortuneArray[fortuneNum].toString();
		return fortune;
	}

}
