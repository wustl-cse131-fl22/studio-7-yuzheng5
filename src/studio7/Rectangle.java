package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length; 
	private double width;
	
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea()
	{
		return length * width;
	}
	public double getPerimeter()
	{
		return 2*(length) + 2*(width);
	}
	public boolean bigger(Rectangle r2) {
		if(this.getArea() > r2.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean square() {
		if(length == width){
			return true;
		}
		else {
			return false;
		}
	}
	public void draw (double x, double y) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(x, y, (0.5)*length, (0.5)*width);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(0.1, 0.1);
		System.out.println(r);
		r.draw(0.5,0.5);
		
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "] " + this.getArea() + " " + this.getPerimeter() + this.bigger(new Rectangle(2,3)) + " " + this.square() ;
	}

}
