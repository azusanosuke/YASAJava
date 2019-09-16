package lesson4_7;

import java.awt.Graphics;

class Rectangle extends Shape {

	public Rectangle(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics g) {
		g.drawRect(getX(), getY(), 10, 10);
	}

}
