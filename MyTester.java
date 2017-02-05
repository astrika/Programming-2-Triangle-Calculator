//************************************************************
// Astrid Manuel
// 3354122
// COP3337
// Section U04
// Assignment#2
// Semptember 15,2016
// 
// I hereby certify that this collective work is my own 
// and none of it is the work of any other person or entity
//
//
//
//************************************************************ 


import java.lang.Math; //used in order to round degrees
import java.util.Scanner; //used for obtaining input from user
import java.text.DecimalFormat; //used for rounding to 4 decimals

/**
		                My Tester
	The purpose of this class is to test Triangle class.
	This class prompts user for three points of a triangle 
	and displays several properties for the triangle created
	by those three points. These properties include: the length
	of three sides, the measure of the three angles, the area 
	of triangle and the perimeter of triangle.
	Solves COP3337 Assignment 2

	To compile and run:
	javac Triangle.java
	javac MyTester.java
	java MyTester
*/

public class MyTester{
	
	
	public static void main(String[] args){
		
		System.out.println("\nCreate triangle with points A, B, C. Please input these 3 points:");	

		Triangle triangle = new Triangle();
		
		DecimalFormat fourDecimalFormat = new DecimalFormat("0.0000");
		
		triangle.setAx(promptUser("Ax"));
		triangle.setAy(promptUser("Ay"));
		triangle.setBx(promptUser("Bx"));
		triangle.setBy(promptUser("By"));	
		triangle.setCx(promptUser("Cx"));
		triangle.setCy(promptUser("Cy"));
		
		displayPoints(triangle);

		obtainProperties(triangle, fourDecimalFormat);
	}

/**
promptUser method prompts user for a variable
this method is used to prompt user for Ax,Ay,Bx,By,Cx,Cy variables 
for triangle with points A, B, C
@param variable the variable that is to be input by user
@return value the value that the user inputs for said variable
**/
	private static double promptUser(String variable) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input value for " + variable + ".");
		while(!scanner.hasNextDouble()){ //hasNextDouble() waits for input if empty
			System.out.println("Invalid input. Please input number.");
			scanner.next();
		}
		double value = scanner.nextDouble();
		return value;
	}
	
/**
displayPoints method displays the points that the user input for clarity
@param triangle the triangle that user has created
*/
	
	private static void displayPoints(Triangle triangle){
		System.out.println("\nPoint A: (" + triangle.getAx() + ", " + triangle.getAy() + ")");
		System.out.println("Point B: (" + triangle.getBx() + ", " + triangle.getBy() + ")");
		System.out.println("Point C: (" + triangle.getCx() + ", " + triangle.getCy() + ")");
	}
	
/**
obtainProperties method displays the properties that are calculated by triangle class
side lengths, area and perimeter values are rounded to four decimal points
measure of angles is rounded to nearest degrees
@param triangle triangle created by user
@param fourDecimalFormat format used to round values to four decimal points
*/
	
	public static void obtainProperties(Triangle triangle, DecimalFormat fourDecimalFormat){
		System.out.println("\nProperties of Triangle:\n\nProperty        Value");
		System.out.println("Side  AB    " + fourDecimalFormat.format(triangle.calculateSideAB()) + " units");
		System.out.println("Side  BC    " + fourDecimalFormat.format(triangle.calculateSideBC()) + " units");
		System.out.println("Side  CA    " + fourDecimalFormat.format(triangle.calculateSideCA()) + " units");	
		System.out.println("Angle A     " + Math.round(triangle.calculateAngleA()) + " degrees");
		System.out.println("Angle B     " + Math.round(triangle.calculateAngleB()) + " degrees");
		System.out.println("Angle C     " + Math.round(triangle.calculateAngleC()) + " degrees");
		System.out.println("Area        " + fourDecimalFormat.format(triangle.calculateArea()) + " units squared");
		System.out.println("Perimeter   " + fourDecimalFormat.format(triangle.calculatePerimeter()) + " units");
	}




		
}
