package MYCLU;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	   
	    
	    // Generate two random nums between 1 and 6
	    int a = randNum(1, 6);
	    int b = randNum(1, 6);
	    
	    // Check sum of two dices
	    int s = sum(a, b);
	    System.out.printf("You rolled %d + %d = %d\r\n",a ,b ,s);
    	
	    
	    // if sum is 2, 3, 12 called craps - you lose
	    if (s == 2 || s == 3 || s == 12) {
	    	System.out.print("You lose");	    	
	    }
	    
	    // if sum is 7, 11 called natural - you win
	    else if (s == 7 || s == 11) {
	    	System.out.print("You win");
	    }
	    
	    // if sum other you got a point
	    else {
	    	System.out.printf("point is %d\r\n", s);
	    }
	    
	    // continue until lose
   }


	
	
	public static int randNum(int start, int end) {
		int randResults = 0;
		
		randResults = (int) (Math.random() * end + start); 
		
		return randResults;
	}
	
	
	public static int sum(int a, int b) {
		int s = 0;
		
		s = a + b;
		
		return s;
	}

}
