package MYCLU;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		 // Create a Scanner
		 Scanner input = new Scanner(System.in);
		
		 // Keep reading data until the input is 0
		 int sum = 0;
		 int data = 0;
		 
		 do {
			  // Read an initial data
			 System.out.print("Enter an integer (the input ends if it is 0): ");
		 
			 data = input.nextInt();
			 
			 sum += data;
		 }
		 while (data != 0);
		
		 System.out.println("The sum is " + sum);
		}

	}


