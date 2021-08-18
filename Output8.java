//***
//* Create a console application to get the student number, student name, marks 
//* for 3 modules and to display 
//* the student number, student name, total marks, average marks and the grade
//* 0-49	Fail
//* 50-59	Pass
//* 60-69	Credit
//* 70-79	Very Good Pass
//* 80-100	Distinction
//***

import java .util.Scanner;
public class Output8{
	public static void main(String []args){

		String toContinue;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.println("\nEnter student number ");
		int number = s.nextInt();
		System.out.println("Enter name");
		String name = s.next();
		System.out.println("Enter your module 1, 2 and 3 marks");
		float module1 = s.nextFloat();
		float module2 = s.nextFloat();
		float module3 = s.nextFloat();

		System.out.println("\n\n_______Student Modul Marks_______\n");
		
		System.out.println("Student Number :- "+number);
		System.out.println("Name :- "+name);
		System.out.println("Student Number :- "+number);

		float total = module1+module2+module3;
		float avg = total/3;

		System.out.println("Total marks of the modules :- "+String.format("%.2f",total));
		System.out.println("Avarage mark :- "+String.format("%.2f",avg));
		
		if(total<49){
			System.out.println("\"Grade = Fail\"");
		}else if(total<59){
			System.out.println("\"Grade = Pass\"");
		}else if(total<69){
			System.out.println("\"Grade = Credit\"");
		}
		else if(total<79){
			System.out.println("\"Grade = Very Good Pass\"");
		}
		else{
			System.out.println("\"Grade = Distinction\"");
		}

		System.out.println("\n Do you want to continue - y/n");
		toContinue = s.next();

		}while(toContinue.charAt(0) == 'y');
			System.out.println("\n Thank you for using the system");
	}
}