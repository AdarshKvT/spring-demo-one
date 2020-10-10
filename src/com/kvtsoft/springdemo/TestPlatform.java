package com.kvtsoft.springdemo;

import java.util.Random;

public class TestPlatform {

	public static void main(String[] args) {

		String[] fortuneArray = { "Character consist of what you do on the third and forth tries",
				"Winner never quite and quitter never win", "You can't beat the person who won't give up" };

		// int arrayLeng = fortuneArray.length;
		// System.out.println("arrayLeng: " + arrayLeng);

		Random random = new Random();
		int fortuneNum = random.nextInt(fortuneArray.length);
		System.out.println(fortuneArray[fortuneNum]);

	}

}
