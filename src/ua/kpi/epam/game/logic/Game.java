package ua.kpi.epam.game.logic;

import java.util.ArrayList;
import java.util.Random;

import ua.kpi.epam.game.printing.Printing;


public class Game {
	private Random randValue = new Random();
	
	private final int RAND_MAX = 10000; 
	
	private ArrayList <Integer> previousAttempts = new ArrayList<>();

	/**
	 * Minimal and maximal values of the game
	 */
	private int minBound; 
	private int maxBound;

	private int mainNumber;
	
	/**
	 * Class for printing all messages 
	 */
	
	private Printing printing = new Printing();
	
 	public Game () {
		minBound = 1;
		maxBound = 100;
		mainNumber = rand(minBound, maxBound);
	}
 	
 	/**
 	 * Main logic of the game
 	 */
	public void runGame () {
		CheckValue check = new CheckValue();
		printing.introduction();
		int attempNumber = 0; 
		while (true) {
			attempNumber = check.setIntegerValue(minBound, maxBound);
			previousAttempts.add(attempNumber);
			if(attempNumber == mainNumber) {
				printing.victory(previousAttempts);
				break;
			}
			else {
				if(attempNumber<mainNumber) {
					minBound = attempNumber;
				}
				else if (attempNumber>mainNumber) {
					maxBound = attempNumber;
				}
				printing.tryAnotherValue (minBound, maxBound, previousAttempts);
			}
			
		}
	}
	
	
	/**
	 * Generate random value between minimal and maximal bounds 
	 * @param min - minimal bound
	 * @param max - maximal bound
	 * @return - random number between bounds
	 */
	public int rand (int min, int max) {
		int value = 0;
		while(value<min) {
			value = randValue.nextInt(max);
		}
		return value;
	}
	
	/**
	 * Generate random value between 0 and RAND_MAX
	 * @return random value
	 */
	public int rand () {
		return randValue.nextInt(RAND_MAX);
	}
	
}
