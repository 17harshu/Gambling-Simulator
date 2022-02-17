package com.gambling;

public class GamblingSimulation {
	public static int STAKE = 100;
	public static int BET = 1;
	public static final int STAKE_PER_DAY = 100;// STAKE PER DAY

	/*
	 * As a Gambler make $1 bet so either win or loose $1
	 */
	public static void winLose() {
		double ran = Math.floor((Math.random() * 10) % 2);
		System.out.println("Random Value: " + ran);
		if (ran == BET)
			STAKE++;
		else
			STAKE--;
		System.out.println("Stake value: " + STAKE);
	}

	/*
	 * Gambler if won or lost 50% of the stake, would resign for the day
	 */
	public static void resignDayCheck() {
		int totalStake = 0;
		while (STAKE != 50 && STAKE != -50) {
			winLose();
		}
		totalStake = STAKE + STAKE_PER_DAY;
		System.out.println("Total stake for resign for a day is  " + totalStake);
	}

	/*
	 * After 20 days of playing every day would like to know the total amount won or
	 * lost.
	 */
	public static void monthlyWinOrLoss() {
		int day;
		for (day = 1; day <= 20; day++) {
			System.out.printf("day %d\n", day);
			resignDayCheck();
		}
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator");
		monthlyWinOrLoss();
	}
}
