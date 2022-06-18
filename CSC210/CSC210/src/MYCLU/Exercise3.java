package MYCLU;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		int days = 0;
		
		System.out.println("Enter a year:\t");
		int year = input.nextInt();
		
		System.out.println("Enter a month (first 3 letters):\t");
		String month = input.nextLine();
		
		if (year % 4 == 0) {
			if (month.toLowerCase() == "feb") {
				days = 29;
			}
		}
		
	    System.out.printf("%s %s has %d days", month, year, days);

	}

}
