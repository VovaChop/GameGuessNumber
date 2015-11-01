package ua.kpi.epam.game.main;
import ua.kpi.epam.game.logic.Game;

public class MainClass {
	/**
	 * starting the game
	 * @param args
	 */
	public static void main(String[] args) {
		Game play = new Game();
		play.runGame();
	}

}
