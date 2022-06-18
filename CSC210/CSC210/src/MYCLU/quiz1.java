package MYCLU;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		
		if (i % 5 == 0 && i % 6 != 0) {
			System.out.println("Is " + i + " divisible by 5 and 6? false");
			System.out.println("Is " + i + " divisible by 5 or 6? true");
			System.out.println("Is " + i + " divisible by 5 or 6, but not both? true");
			
		}
		else if (i % 6 == 0 && i % 5 != 0) {
			System.out.println("Is " + i + " divisible by 5 and 6? false");
			System.out.println("Is " + i + " divisible by 5 or 6? true");
			System.out.println("Is " + i + " divisible by 5 or 6, but not both? true");
			
		}
		else if (i % 6 == 0 && i % 5 == 0) {
			System.out.println("Is " + i + " divisible by 5 and 6? true");
			System.out.println("Is " + i + " divisible by 5 or 6? true");
			System.out.println("Is " + i + " divisible by 5 or 6, but not both? false");
			
		}
		else {
			System.out.println("Is " + i + " divisible by 5 and 6? false");
			System.out.println("Is " + i + " divisible by 5 or 6? false");
			System.out.println("Is " + i + " divisible by 5 or 6, but not both? false");
			
		}

	}

}
