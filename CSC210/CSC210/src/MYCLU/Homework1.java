// Kai Wolf
// 02/01/2022
// Calculating Future Investment Value
// Input: Investment Value, annual interest rate, number of years
// Output: future investment value



package MYCLU;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
	    // Create a Scanner Object
		Scanner input = new Scanner(System.in);
			
		// Read in investment amount
		System.out.println("Enter investment amount: ");
		double investment = input.nextDouble();
		
		// Read in annual interest rate
		System.out.println("Enter annual interest rate: ");
		double interest = input.nextDouble();
		
		// Convert annual rate to monthly rate
		double monthlyinterest = interest / 1200;
		
		// Read in number of years
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		// Calculate future investment value
		double exponent = Math.pow((1 + monthlyinterest), (years *12));
        double value = investment * exponent;
        
        // Round output
        double value2 = Math.round(value * 100.0) / 100.0;
		
		// Display result
		System.out.println("The future investment value is " + value2);
		

	}

}
