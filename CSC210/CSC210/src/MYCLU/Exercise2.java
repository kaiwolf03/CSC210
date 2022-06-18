package MYCLU;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		int num;
		
		// Read in number
		System.out.println("Enter an ASCII code: ");
		num = input.nextInt();
		
		if (num > 0 && num <= 127) {
		
		char charNum = (char)num;
		System.out.println("The character for the ASCII code " + num + " is " + charNum);
		
		}
		
		else {
			System.out.println("nope");
		}
	}

}
