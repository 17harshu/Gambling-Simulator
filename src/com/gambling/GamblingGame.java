package com.gambling;

public class GamblingGame {
	static int stake = 100;
	static int bet = 1;
	
	public static void winLose() {
		double ran = Math.floor((Math.random()*10)%2);
		System.out.println("Random Value: " + ran);
        if(ran == bet)
            stake++;
        else
            stake--;
        System.out.println("Stake value: " + stake);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator");
		
		winLose();
	}
}
