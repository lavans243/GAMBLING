package com.bridgelabz;

public class UC4_20daysGambling {

	 static int BET = 1;

	    public static void main(String[] args) {
	        System.out.println("Welcome to Gambling Game");


	        for (int i = 0; i < 21; i++) {

	            int totalAmount = 100;
	            int play = 0;

	            while (totalAmount > 80 && totalAmount < 200) {
	                play++;
	                int out = (int) (Math.random() * 2);
	                if (out == 1) {
	                    totalAmount = totalAmount + BET;
	                } else {
	                    totalAmount = totalAmount - BET;
	                }
	            }
	            int max = totalAmount;
	            System.out.println("The number of time played are " + play);
	            System.out.println("Total amount " + totalAmount + " on day " + i);
	            if (max > 100) {
	                System.out.println("You won  80$");
	            } else {
	                System.out.println("You lost  80%");
	            }
	        }
	    }	
}
