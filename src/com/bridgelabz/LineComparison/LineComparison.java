package com.bridgelabz.LineComparison;

import java.util.Scanner;

/**
 * 
 * @author HITESH
 *
 */
public class LineComparison {
	/**
	 * taking 4 variables taking scanner function
	 */
	int x1, x2, y1, y2;
	double disOfFirstLine;
	double disOfSecondLine;
	static Scanner input = new Scanner(System.in);

	public void input() {
		/**
		 * taking 4 coordinates from user
		 */
		System.out.println("Enter value for x1");
		x1 = input.nextInt();
		System.out.println("Enter value for x2");
		x2 = input.nextInt();
		System.out.println("Enter value for y1");
		y1 = input.nextInt();
		System.out.println("Enter value for y2");
		y2 = input.nextInt();
		System.out.println("Two points are " + x1 + "," + x2 + " and " + y1 + "," + y2);
	}

	public void firstDistance() {
		/**
		 * calculating distance for first line
		 */
		input();
		disOfFirstLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of the first line is " + disOfFirstLine);
		return;
	}

	public void SecondDistance() {
		/**
		 * calculating distance for second line
		 */
		input();
		disOfSecondLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of the second line is " + disOfSecondLine);
	}

	public void Compring() {
		/**
		 * taking value of first distance and second distance comparing two lines using
		 * compareTo method
		 */
		firstDistance();
		SecondDistance();
		@SuppressWarnings("removal")
		Integer obj1 = new Integer((int) disOfFirstLine);
		@SuppressWarnings("removal")
		Integer obj2 = new Integer((int) disOfSecondLine);
		System.out.println("these lines are equal :" + obj1.equals(obj2));
		if (+obj1.compareTo(obj2) > 0) {
			System.out.println("Length of first line is greater");
		} else {
			System.out.println("Length of Second line is greater");
		}
	}
}