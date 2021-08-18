import java.util.Scanner;
public class Output5{
	public static void main(String []args){
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Input Salesman Number ");
		int number = s.nextInt();
		System.out.println("Input Salesman Name ");
		String name = s.next();
		System.out.println("Input sold unit count ");
		int units = s.nextInt();
		System.out.println("Input sold price ");
		double price = s.nextDouble();

		double saleValue = units*price;
		
		System.out.println("\n\n ---Sale Details---\n");
		System.out.println("Sale number :- "+number);
		System.out.println("Name :- "+name);
		System.out.println("Sale value :- Rs."+saleValue);
		
	}
}