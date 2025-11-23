package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		//FIXME
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = Color.RED;
		//See ColorUtils for some color options (or choose your own)
	}

	/**
	 * Draws the segment
	 */
	public void setPosition(double deltaX, double deltaY) {
		this.x = this.x + deltaX;
		this.y = this.y + deltaY;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void draw() {
		StdDraw.setPenColor(this.color);
		StdDraw.filledRectangle(this.x,this.y, size/2, size/2);
	}
	
}
