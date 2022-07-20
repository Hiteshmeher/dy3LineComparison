package com.bridgelabz.LineComparison;
/**
 * 
 * @author LENOVO
 *
 */
public class LineComparison {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking two coordinates to create a straight line
		 * calculating its length
		 */
		System.out.println("Welcome to Line Comparison computation");
		int x1 = 3;
		int x2 = 7;
		int y1 = 4;
		int y2 = 2;
		double dis = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Two points are (x1,y1)(2,3) and (x2,y2)(4,1)");
		System.out.println("Length of the line (2,3)(4,1) is " + dis);
	}

}
