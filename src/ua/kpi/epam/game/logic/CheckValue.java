package ua.kpi.epam.game.logic;

import java.awt.image.RescaleOp;
import java.util.InputMismatchException;
import java.util.Scanner;

import ua.kpi.epam.game.printing.Printing;

public class CheckValue {
	
	Printing printing = new Printing();
	
	/**
	 * Checking entered message
	 * @param minBound
	 * @param maxBound
	 * @return checked entered number
	 */
	public int setIntegerValue (int minBound, int maxBound) {
		int result = 0;
		while (true) {
			Scanner in = new Scanner(System.in);
			try {
				result = in.nextInt();
			}	catch (InputMismatchException e) {
				printing.notNumber(minBound, maxBound);
				continue;
			}
			if(protectionFromFools(result, minBound, maxBound) == 1) {
				continue;
			}
			return result;
		}
	}
	
	/**
	 * Check number conformity to bound
	 * @param value - entered number
	 * @param minBound - minimal bound
	 * @param maxBound - maximal bound
	 * @return 1 if number is out of bounds and 0 if number is correct
	 */
	private int protectionFromFools (int value, int minBound, int maxBound) {
		if(value < minBound || value > maxBound) {
			printing.protFromFools(minBound, maxBound);
			return 1;
		}
		return 0;
	}
}
