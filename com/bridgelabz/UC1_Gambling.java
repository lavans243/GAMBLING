package com.bridgelabz;
import java.util.Random;

public class UC1_Gambling {

	int stake = 100;

	public void putBet() {
		Random rnd = new Random();
		int reslt = rnd.nextInt(2);
		if (reslt == 0) {
			System.out.println("Lost bet of 1$");
		} else {
			System.out.println("Won bet of 1$!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UC1_Gambling gm = new UC1_Gambling();
		gm.putBet();
	}

}
