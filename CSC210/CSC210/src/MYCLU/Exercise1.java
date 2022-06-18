package MYCLU;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		double interest = 5.0/100;
		
		// Convert annual rate to monthly rate
		double monthlyinterest = interest / 12;
		
		// Read monthly saving amount
		System.out.println("Enter monthly saving amount: ");
		double amount = input.nextInt();
		
		// Calculation 
		double month = amount * (1 + monthlyinterest);
		month = (month + amount) * (1 + monthlyinterest);
		month = (month + amount) * (1 + monthlyinterest);
		month = (month + amount) * (1 + monthlyinterest);
		month = (month + amount) * (1 + monthlyinterest);
		month = (month + amount) * (1 + monthlyinterest);
		
		// Print amount after six months
		System.out.printf("Amount after six months is: " + month);
		
	
	}

}
