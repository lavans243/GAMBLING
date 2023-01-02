package com.bridgelabz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class UC6_Lucky {
	
	 static int BET = 1;
	    static ArrayList<Integer> list = new ArrayList<>();
	    public void Lucky(ArrayList a){

	        ArrayList<Integer> list2 = new ArrayList<>();
	        for (int i = 0; i<20; i++){
	            list2.add(i,list.get(i));
	        }
	        Collections.sort(list);
	        int x = list2.indexOf(list.get(19));
	        int y = list2.indexOf(list.get(0));

	        System.out.println("The luckiest day is " + (x+1));
	        System.out.println("The unluckiest day is " + (y+1));
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to Gambling Game");
	        int won = 0;
	        int loss = 0;

	        for (int i = 0; i < 20; i++) {

	            int totalAmount = 100;
	            int play = 0;
	            int wonToday = 0;

	            while (totalAmount > 50 && totalAmount < 150) {
	                play++;
	                int out = (int) (Math.random() * 2);
	                if (out == 1) {
	                    totalAmount = totalAmount + BET;
	                    wonToday++;
	                } else {
	                    totalAmount = totalAmount - BET;
	                }
	            }
	            System.out.println("The number of today's won is " + wonToday);
	            int max = totalAmount;
	            System.out.println("The number of time played are " + play);
	            System.out.println("Total amount in hand " + totalAmount + " on day " + i);
	            if (max > 100) {
	                won++;
	                System.out.println("You won with 50$");
	            } else {
	                loss++;
	                System.out.println("You lost with 50%");
	            }
	            list.add(wonToday);
	        }

	        UC6_Lucky obj = new UC6_Lucky();
	        obj.Lucky(list);

	        System.out.println("The Days of won in this month " + won);
	        System.out.println("The Days of won in this month " + loss);
	    }
}
