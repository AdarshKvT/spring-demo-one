package com.kvtsoft.beanscope;

import java.util.Random;

public class FortuneServiceImp implements FortuneService {

	@Override
	public String getFortune() {

		String[] fortuneArray = { "Character consist of what you do on the third and forth tries",
				"Winner never quite and quitter never win", "You can't beat the person who won't give up" };

		Random rn = new Random();
		int index = rn.nextInt();

		String fortuneString = fortuneArray[index].toString();
		return fortuneString;
	}

}
