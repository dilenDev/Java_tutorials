//***
//Write a program to implement a simple calculator with +, -,*,/ and %
//functionalities. Hint: Use functions for each calculation
//***

import java.util.Scanner;
public class Output01{
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);

//geting the user input

		System.out.println("Enter first number");
		float number1 = s.nextFloat();
		System.out.println("Enter second number");
		float number2 = s.nextFloat();

//calling decleaed functions to main method

	float cal1 = sum(number1,number2);
	float cal2 = add(number1,number2);
	float cal3 = devide(number1,number2);
	float cal4 = module(number1,number2);
	float cal5 = minus(number1,number2);

//print the output

	System.out.println("Summation :- "+cal1);
	System.out.println("Addition :- "+cal2);
	System.out.println("Devition :- "+cal3);
	System.out.println("Module :- "+cal4);
	System.out.println("Minus :- "+cal5);
	}

//declaring functions
//outside the mainmethod
//static - with this mkeyword methods can call anywhere in the class

	private static float sum(float number1, float number2){
	return number1+number2;
	}
	private static float add(float number1, float number2){
	return number1*number2;
	}
	private static float devide(float number1, float number2){
	return number1/number2;
	}
	private static float module(float number1, float number2){
	return number1%number2;
	}
	private static float minus(float number1, float number2){
	return number1-number2;
	}
}