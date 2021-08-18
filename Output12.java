//***
//Create a console application to get the radius of the base and height 
//of a cylinder and to display the surface area and the volume of the cylinder
//Surface area = (2* π*Radius)*height
//Volume =( π *Radius2)*height
//***

import java.util.Scanner;
public class Output12{
	public static void main(String []args){
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter cylinder base Radius value ");
		float radius = s.nextFloat();
		System.out.println("Enter cylinder Height value ");
		float height = s.nextFloat();

		double surfaceArea = (2 * Math.PI * radius)* height;
		double volume =( Math.PI * radius)*height;

		System.out.println("Surface area of the cylinder :- "+String.format("%.3f",surfaceArea));
		System.out.println("Volume of the cylinder :- "+String.format("%.3f",volume));
	}
}