// Kai Wolf
// 02/14/2022
// Proper Fractions, Improper Fractions, and Mixed Fractions (Interstate highway numbers)
// Input: Highway number
// Output: if the highway is primary or auxiliary, north/south or east/west, and if auxiliary which highway it serves



package MYCLU;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		int num;
		
		// Read in highway number
		System.out.println("Enter highway number: ");
		num = input.nextInt();
		
		int num2 = num - 100;
		
		// 0 invald
		if (num == 0) {
			System.out.println(num + " is not a valid number.");
		}
		
		// primary
		else if (num <= 99) {
			
			// even, east/west
			if (num % 2 == 0) {
				System.out.println("I-" + num + " is primary, going east/west.");
			}
			
			// odd, north/south
			else {
				System.out.println("I-" + num + " is primary, going north/south.");
			}
		}
		
		// not valid
    	else if (num == 100) {
    		System.out.println(num + " is not a valid number.");
    	}
    	else if (num >= 200) {
    		System.out.println(num + " is not a valid number.");
    	}
		
		// auxiliary
    	else {
    		
    		// even, east/west
    		if (num % 2 == 0) {
    			System.out.println("I-" + num + " is auxiliary, serving I-" + num2 + " going east/west.");
    		}
    		
    		// odd, north/south
    		else {
    			System.out.println("I-" + num + " is auxiliary, serving I-" + num2 + " going north/south.");
    		}
    	}

	}

}
