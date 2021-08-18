import java.util.Scanner;
public class Output7{
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student Number ");
		int number = s.nextInt();
		System.out.println("Enter Name ");
		String name = s.next();
		System.out.println("enter first modual mark ");
		float modual1 = s.nextFloat();
		System.out.println("enter second modual mark ");
		float modual2 = s.nextFloat();
		System.out.println("enter thired modual mark ");
		float modual3 = s.nextFloat();
		
		float total = modual1+modual2+modual3;
		float avg = total/3;
		
		System.out.println("\n\n----MODUL MARKS----\n")
		System.out.println("Student Number :- "+number);
		System.out.println("Name :- "+name);
		System.out.println("Toal mark of the moduls :- "+total);
		System.out.println("Avarage mark :- "+String.format("%.2f",avg));
		
		if(avg>50){
			System.out.println("------Pass-----");
		}else{
			System.out.println("------Fail-----");
		}
	}
}