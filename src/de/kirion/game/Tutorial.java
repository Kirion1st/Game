package de.kirion.game;

import de.kirion.gameEngine.Game;

/**
 * 
 * @author Kirion1st
 *
 */
public class Tutorial extends Game {

	public Tutorial(int width, int height, String windowName) {
		super(width, height, windowName);
	}

	public static void main(String[] args) {
		Tutorial t = new Tutorial(800, 600, "Game Window");
		t.run();
	}
}
