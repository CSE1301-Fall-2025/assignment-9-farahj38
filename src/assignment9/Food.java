package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	private Color color;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() {
		this.x = Math.random();
		this.y = Math.random();
		this.color = Color.red;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(this.color);
		StdDraw.filledRectangle(x,y,FOOD_SIZE/2,FOOD_SIZE/2);
	}
	
}
