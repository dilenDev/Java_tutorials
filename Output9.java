//***
//Create a console application to get 
//the salesman number, salesman name, number of units sold, unit price and
//display the salesman number, salesman name and the sales value in a different screen.
//Sales representative is given a commission of 10% for the excess sales if the sales is greater than 50,000.
//Also display the commission and the final salary .the basic salary is 25,000.
//(Sales Value = number of unit sold*unit price/final salary = basic salary + commission)
//***

import java.util.Scanner;
public class Output9{
	public static void main(String []args){
		
		String toContinue;
	
		Scanner s = new Scanner(System.in);

		do{
		System.out.println("\nEnter Salesman Number ");
		int number = s.nextInt();
		System.out.println("Enter Name ");
		String name= s.next();
		System.out.println("Sold unit count ");
		int count = s.nextInt();
		System.out.println("Unit price ");
		float price = s.nextFloat();

		float salesValue = count*price;
		
		System.out.println("\n\n---Sales Report---\n");
		System.out.println("Salesman Number :- "+number);
		System.out.println("Salesman Name :- "+name);
		System.out.println("total Sale Value :- Rs."+String.format("%.2f",salesValue));

		if(salesValue > 50000){
			float commission = (salesValue*10)/100;
			float finalSalary = 25000 + commission;
			System.out.println("Added Commission :- Rs."+String.format("%.2f",commission));
			System.out.println("Salary :- Rs."+String.format("%.2f",finalSalary));
		}else{
			System.out.println("Salary :- Rs.25,000.00");
		}
		
		System.out.println("\nDo you want to continue - y/n ");
		toContinue = s.next();
	
		}while(toContinue.charAt(0) == 'y');
			System.out.println("\n Thank you for using the system");
	}
}