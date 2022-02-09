package com.gambling;

public class GamblingGame {
	public static int STAKE = 100;
	public static int BET = 1;
	
	public static void winLose() {
		double ran = Math.floor((Math.random()*10)%2);
		System.out.println("Random Value: " + ran);
        if(ran == BET)
            STAKE++;
        else
            STAKE--;
        System.out.println("Stake value: " + STAKE);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator");
		
		winLose();
	}
}
