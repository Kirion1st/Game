package de.kirion.game;

import de.kirion.gameEngine.Game;
import de.kirion.gameEngine.rendering.Mesh;

/**
 * 
 * @author Kirion1st
 *
 */
public class Tutorial extends Game {

	private Mesh triangle;
	
	public Tutorial(int width, int height, String windowName) {
		super(width, height, windowName);
	}

	public static void main(String[] args) {
		Tutorial t = new Tutorial(800, 600, "Game Window");
		t.run();
	}
	
	@Override
	public void init() {
		triangle = new Mesh(new float[] {-0.5f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, 0, 0.5f, 1.0f} );
	}
	
	@Override
	public void render() {
		triangle.render();
	}
	
	@Override
	public void release() {
		triangle.release();
	}
}
