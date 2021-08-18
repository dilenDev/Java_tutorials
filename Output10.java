//***
//Create a console application to get the radius of a circle and
//to display the circumference and the area of the circle . 
//Circumference = 2* π *Radius                
//Area = π *Radius2
//***

import java.util.Scanner;
public class Output10{
	public static void main(String []args){
		
		String toContinue;

		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println("\nGive Radius Value of the circle ");
		float radius = s.nextFloat();
		
		float circumference = (2 * 22 * radius)/7;
		float area = (22 * radius * radius)/7;

		System.out.println("\nCircumference of the circle :- "+circumference);
		System.out.println("Area of the circle :- "+area);

		System.out.println("\nDo you want to continue - y/n ");
		toContinue = s.next();

		}while(toContinue.charAt(0) == 'y');
			System.out.println("Thankyou for using the system");
	}
}