package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double lengthValue, double widthValue) {
		length = lengthValue;
		width = widthValue;
	}
	
	
	public double recArea() {
		double area = this.length * this.width;
		return area;
	}
	
	public String toString(boolean holder) {
		String areaString = holder + "";
		return areaString;
	}
	
	public static boolean sizeChecker(Rectangle A, Rectangle B) {
		if(A.recArea() > B.recArea()) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	private double getLength() {
		return length;
	}

	private double getWidth() {
		return width;
	}

	public static boolean squareChecker(Rectangle inQuestion) {
		if (inQuestion.getLength() == inQuestion.getWidth()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle fire = new Rectangle(5.3, 4.1);
		Rectangle water = new Rectangle(2, 2);
		
		Boolean sizeResult = sizeChecker(fire, water);
		System.out.println(sizeResult);
		
		Boolean squareResult = squareChecker(fire);
		System.out.println(squareResult);
		
		Boolean squareResult2 = squareChecker(water);
		System.out.println(squareResult2);
		
	}

}
