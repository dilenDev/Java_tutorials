//***
//Create a console application to get the height and width of a 
//rectangle and to display the perimeter and area of the rectangle 
//Perimeter = 2*(height+width)        Area = height*width
//***

import java.util.Scanner;
public class Output11{
	public static void main(String []args){
		
		Scanner s = new Scanner(System.in);

		System.out.println("");
		System.out.println("Enter rectangle height ");
		float height = s.nextFloat();
		System.out.println("Enter rectangle width ");
		float width = s.nextFloat();

		float perimeter = 2*(height+width);
		float area = height*width;

		System.out.println("Perimeter of the Rectangle :- "+String.format("%.3f",perimeter));
		System.out.println("Area of the Rectangle :- "+String.format("%.3f",area));
	}
}