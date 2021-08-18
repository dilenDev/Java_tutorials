import java.util.Scanner;
public class Output6{
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student Number ");
		int number = s.nextInt();
		System.out.println("Enter Name ");
		String name = s.next();
		System.out.println("Enter first modual marks ");
		float modual1 = s.nextFloat();
		System.out.println("Enter second modual marks ");
		float modual2 = s.nextFloat();
		System.out.println("Enter third modual marks ");
		float modual3 = s.nextFloat();
		
		float total = modual1+modual2+modual3;
		float avg = total/3;
		
		System.out.println("\n\n---Modual Marks---\n");
		System.out.println("Student Number :- "+number);
		System.out.println("Name :- "+name);
		System.out.println("Total marks of the moduals :- "+total);
		System.out.println("Avarage mark :- "+avg);

	}
}