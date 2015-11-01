package ua.kpi.epam.game.printing;

import java.util.ArrayList;

public class Printing {
	
	public void protFromFools (int minBound, int maxBound) {
		System.out.print("Your value is out of bounds. ");
		betweenNumbers(minBound, maxBound);
	}
	
	
	
	/**
	 * Printing minimal and maximal bounds of the game
	 * @param minBound - minimal value
	 * @param maxBound - maximal value
	 */
	public void printBounds (int minBound, int maxBound) {
		System.out.println("Target number is between " + minBound
				+ " and " + maxBound);
	}
	
	/**
	 * Printing on not integer value with specification limits
	 * @param minBound - minimal value on current moment
	 * @param maxBound - maximum value on current moment
	 */
	public void notNumber (int minBound, int maxBound) {
		System.out.println("You didn't enter a number. ");
		betweenNumbers(minBound, maxBound);
	}



	private void betweenNumbers(int minBound, int maxBound) {
		System.out.println("Please, enter the value between " + minBound
				+ " and " + maxBound);
	}
	
	/**
	 * Printing on guessed wrong number
	 */
	public void wrongNumber () {
		System.out.println("Sorry, your number is wrong. Please, try again.");
	}
	
	/**
	 * The introduction of the program.
	 */
	public void introduction () {
		System.out.println("Hello! In this game you have to guess"
				+ " a number from 0 to 100."
				+ " Please, enter your number:");
	}
	
	/**
	 * Printing all the previous attempts
	 * @param attempts - the array of all attempts
	 */
	public void printAttempts (ArrayList <Integer> attempts) {
		System.out.println("Your attempts:");
		for(Integer i : attempts) {
			System.out.print(i + " ");
		}System.out.println();
	}
	
	/**
	 * printing on guessed number and winning the game
	 * @param attempts - the array with all attempts
	 */
	public void victory (ArrayList <Integer> attempts) {
		System.out.println("Congratulation! You win");
		printAttempts(attempts);
		System.out.println("Total number of attempts is " + attempts.size());
	}
	
	/**
	 * The action on wrong number and offer for new try
	 * @param minBound - minimal value on current moment
	 * @param maxBound - maximal value on current moment
	 * @param attempts - the array with all attempts
	 */
	public void tryAnotherValue (int minBound, int maxBound, ArrayList<Integer> attempts) {
		wrongNumber();
		printAttempts(attempts);
		printBounds(minBound, maxBound);
		System.out.println("Enter new number:");
	}
}
