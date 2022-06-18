package MYCLU;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int num = input.nextInt();
		
		String stName = "";
		double stScore = 0.0;
		
		double highScore = stScore;
		String highSt = stName;
		
		for (int i = 0; i < num; i++) {
			
			System.out.println("Enter students name: ");
		    stName = input.next();
		    
		    System.out.println("Enter students score: ");
		    stScore = input.nextDouble();
		    
		    if (stScore < highScore) {
		    	highScore = stScore;
		    	highSt = stName;
		    }
		}
		
		System.out.println(highSt);

	}

}
