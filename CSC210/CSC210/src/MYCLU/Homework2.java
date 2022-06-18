// Kai Wolf
// CSC210
// 02/05/2022
// Expression for calories burned during workout
// Inputs: age (years), weight (pounds), heart rate (beats per minute), and time (minutes)
// Output: average calories burned for that person



package MYCLU;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		int age;
		double weight;
		int heartrate;
		int time;
		double calories;
		
		// Read in age
		System.out.println("Enter age in years: ");
		age = input.nextInt();
		
		// Read in weight
		System.out.println("Enter weight in pounds: ");
		weight = input.nextDouble();
		
		// Read in heartrate
		System.out.println("Enter heart rate in beats per minute: ");
		heartrate = input.nextInt();
		
		// Read in time
		System.out.println("Enter time in minutes: ");
		time = input.nextInt();
		
		// Calculation 
		calories = ( (age * 0.2757) + (weight * 0.03295) + (heartrate * 1.0781) - 75.4991 ) * time / 8.368;
		
		// Display result
		System.out.printf("Average calories burned: " + "%.2f", calories);

	}

}
