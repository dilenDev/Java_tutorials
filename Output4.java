import java.util.Scanner;

public class Output4{
	public static void main(String arga[]){
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number ");
		double number1 = s.nextDouble();
		System.out.println("Enter second number ");
		double number2 = s.nextDouble();
		
		System.out.println(+number1+"*"+number2+ "=" +number1*number2);
	}
}