//***
//Create a console application to display the following menu to the user 
//1)Circle
//2)Rectangle
//3)Cylinder
//Get the choice of the user and do the following
// Choice	Display
// 1		The area and the circumference of the circle
// 2		The perimeter and the area of the rectangle
// 3		The surface area and the volume of the cylinder
//Enhance the program to continuously run it until user exits.
//***

import java.util.Scanner;
public class Output14{
	public static void main(String []args){
		String toContinue;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println("\nSelect shape number ");
		System.out.println(" 1 - circle\n 2 - rectangle\n 3 - cylinder");
		int choice = s.nextInt();

		switch(choice){
			//must have space between case keyword and value
			case 1:
				System.out.println("\n   \3\3\3Circle it is\3\3\3\n");
				System.out.println("Enter circle Radius value :- ");
				double circleRadius = s.nextDouble();

				double circumference = 2*Math.PI*circleRadius;
				double area =  circleRadius * circleRadius * Math.PI;

				System.out.println("\nCircle Circumference is :- "+String.format("%.3f",circumference));
				System.out.println("Circle Area is :- "+String.format("%.3f",area));
			break;

			case 2:
				System.out.println("\n   \3\3\3Rectangle it is\3\3\3\n");
				System.out.println("Enter rectangle height :- ");
				double rectangleHeight = s.nextDouble();
				System.out.println("Enter rectangle width :- ");
				double rectangleWidth = s.nextDouble();

				double perimeter = (rectangleHeight + rectangleWidth)*2 ;
				double rectangleArea = rectangleHeight + rectangleWidth ;

				System.out.println("\nRectangle Perimeter is :- "+String.format("%.3f",perimeter));
				System.out.println("Rectangle Area is :- "+String.format("%.3f",rectangleArea));
			break;

			case 3:
				System.out.println("\n   \3\3\3Cylinder it is\3\3\3\n");
				System.out.println("Enter base Radius value :- ");
				double baseRadius = s.nextDouble();
				System.out.println("Enter Cylinder Height :- ");
				double cylinderHeight = s.nextDouble();

				double surfaceArea = (2*Math.PI*baseRadius)*cylinderHeight  ;
				double volume= (Math.PI*baseRadius*baseRadius)*cylinderHeight  ;

				System.out.println("\nCylinder Surface Area is :- "+String.format("%.3f",surfaceArea));
				System.out.println("Cylinder Volume is :- "+String.format("%.3f",volume));
			break;		
		}
		System.out.println("\nDo tou want to continue - y/n ");
		toContinue = s.next();

		}while(toContinue.charAt(0) == 'y');
			System.out.println("\nThank you for usting the system");
	}
}
