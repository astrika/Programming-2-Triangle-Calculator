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

/**
Math library used for the computation of lengths of sides,
measure of angles, perimeter of triangle, and area of 
triangle
*/

import java.lang.Math;  

/**
		                Triangle
	The purpose of this class is to describe a triangle and compute
	several properties of the triangle.
	This class computes the length of 3 sides of a triangle,
	measure of 3 angles of a triangle, perimeter of a triangle
	and area of a triangle. Length of sides is computed by 
	using distance formula. Measure of angles is computed by 
	using the Law of Cosines. Perimeter is computed by obtaining 
	sum of length of three sides. Area is computed by using 
	Heron's formula. 
	This class is tested by MyTester class.
	
	Solves COP3337 Assignment 2

	To compile:
	javac Triangle.java
	
	To test:
	javac MyTester.java
	java MyTester
*/


public class Triangle{
	
/**
Instance variables for three points of a triangle
*/
	private double Ax = 0.0;
	private double Bx = 0.0;
	private double Cx = 0.0;
	private double Ay = 0.0;
	private double By = 0.0;
	private double Cy = 0.0;

/**
 A mutator method to set Ax to user input in MyTester class
 @param Ax the x value for point A of triangle
*/

	public void setAx(double Ax){
		this.Ax = Ax;
	}

/**
 A mutator method to set Bx to user input in MyTester class
 @param Bx the x value for point B of triangle
*/

	public void setBx(double Bx){
		this.Bx = Bx;
	}

/**
 A mutator method to set Cx to user input in MyTester class
 @param Cx the x value for point C of triangle
*/
	public void setCx(double Cx){
		this.Cx = Cx;
	}
	
/**
 A mutator method to set Ay to user input in MyTester class
 @param Ay the y value for point A of triangle
*/

	public void setAy(double Ay){
		this.Ay = Ay;
	}

/**
 A mutator method to set By to user input in MyTester class
 @param By the y value for point B of triangle
*/
	
	public void setBy(double By){
		this.By = By;
	}

/**
 A mutator method to set Cy to user input in MyTester class
 @param Cy the y value for point C of triangle
*/
	
	public void setCy(double Cy){
		this.Cy = Cy;
	}

/**
 An accessor method to access Ax in MyTester class
 @return Ax the x value for point A
*/	

	public double getAx(){
		return this.Ax;
	}

/**
 An accessor method to access Bx in MyTester class
 @return Bx the x value for point B
*/	

	public double getBx(){
		return this.Bx;
	}

/**
 An accessor method to get Cx in MyTester class
 @return Cx the x value for point C
*/	

	public double getCx(){
		return this.Cx;
	}

/**
 An accessor method to get Ay in MyTester class
 @return Ay the y value for point A
*/	

	public double getAy(){
		return this.Ay;
	}

/**
 An accessor method to get By in MyTester class
 @return By the y value for point B
*/	

	public double getBy(){
		return this.By;
	}
/**
 An accessor method to get Cy in MyTester class
 @return Cy the y value for point 
*/	

	public double getCy(){
		return this.Cy;
	}

	
/**
 Calculates the length of side created by (Ax,Ay) and (Bx,By)
 Uses distance formula for computation
 @return lengthSideAB the length of side created by (Ax,Ay) and (Bx,By) in units
*/
	
	public double calculateSideAB(){
		double lengthSideAB = Math.sqrt(Math.pow((Bx-Ax),2) + Math.pow((By-Ay),2));
		return lengthSideAB;
	}

/**
 Calculates the length of side created by (Bx,By) and (Cx,Cy)
 Uses distance formula for computation
 @return lengthSideBC the length of side created by (Bx,By) and (Cx,Cy) in units
*/


	public double calculateSideBC(){
		double lengthSideBC = Math.sqrt(Math.pow((Cx-Bx),2) + Math.pow((Cy-By),2));
		return lengthSideBC;
	}

/**
 Calculates the length of side created by (Cx,Cy) and (Ax,Ay)
 Uses distance formula for computation
 @return lengthSideCA the length of side created by (Cx,Cy) and (Ax,Ay) in units
*/


	public double calculateSideCA(){
		double lengthSideCA = Math.sqrt(Math.pow((Cx-Ax),2) + Math.pow((Cy-Ay),2));
		return lengthSideCA;
	}

/**
 Calculates the angle with vertex (Ax,Ay)
 Uses law of cosines for computation
 numerator variable is the numerator in the law of cosines formula
 denominator variable is the denominator in the law of cosines formula
 angle A is obtained by getting the inverse cosine of fraction computed
 Math.toDegrees function is used to convert radians to degrees
 @return AngleA measure of angle with vertex (Ax,Ay) in degrees
*/

	public double calculateAngleA(){
		double numerator = Math.pow(calculateSideAB(),2) + Math.pow(calculateSideCA(),2) - Math.pow(calculateSideBC(),2);
		double denominator = 2 * calculateSideAB() * calculateSideCA();
		double angleA =Math.toDegrees(Math.acos(numerator/denominator));
		return angleA;
	}

/**
 Calculates the angle with vertex (Bx,By)
 Uses law of cosines for computation
 numerator variable is the numerator in the law of cosines formula
 denominator variable is the denominator in the law of cosines formula
 angle B is obtained by getting the inverse cosine of fraction computed
 Math.toDegrees function is used to convert radians to degrees
 @return AngleB measure of angle with vertex (Bx,By) in degrees
*/

	public double calculateAngleB(){
		double numerator = Math.pow(calculateSideBC(),2) + Math.pow(calculateSideAB(),2) - Math.pow(calculateSideCA(),2);
		double denominator = 2 * calculateSideBC() * calculateSideAB();
		double angleB = Math.toDegrees(Math.acos(numerator/denominator));
		return angleB;
	}

/**
 Calculates the angle with vertex (Cx,Cy)
 Uses law of cosines for computation
 numerator variable is the numerator in the law of cosines formula
 denominator variable is the denominator in the law of cosines formula
 angle C is obtained by getting the inverse cosine of fraction computed
 Math.toDegrees function is used to convert radians to degrees
 @return AngleC measure of angle with vertex (Cx,Cy) in degrees
*/

	public double calculateAngleC(){
		double numerator = Math.pow(calculateSideBC(),2) - Math.pow(calculateSideAB(),2) + Math.pow(calculateSideCA(),2);
		double  denominator = 2 * calculateSideBC() * calculateSideCA();
		double angleC = Math.toDegrees(Math.acos(numerator/denominator));
		return angleC;
	}
	
/**
 Calculates the perimeter of triangle with sides AB,BC and CA
 Sum of lengths of sides is computed by calling methods that calculate for each side length
 @return perimeter the perimeter of triangle 
*/

	public double calculatePerimeter(){
		double perimeter = calculateSideAB() + calculateSideBC() + calculateSideCA();
		return perimeter;	
	}

/**
 Calculates the area of triangle 
 Uses Heron's formula to obtain area of triangle
 semiPerimeter variable is half of the perimeter, which is a variable needed
 in Heron's formula
 @return area the area of triangle
*/

	public double calculateArea(){
		double semiPerimeter = calculatePerimeter() / 2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - calculateSideAB()) * (semiPerimeter - calculateSideBC()) * (semiPerimeter - calculateSideCA()));
		return area;
	}
	


}
