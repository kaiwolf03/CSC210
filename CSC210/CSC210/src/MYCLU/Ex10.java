package MYCLU;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    int[] myint = new int[10];
	    
	    System.out.print("Give input: ");
	    
	    for (int i = 0; i < 10; i++) {
	    	myint[i] = input.nextInt();
	    }
	    
	    for (int i = 9; i >= 0; i--) {
	    	System.out.printf("Input %d = %d\r\n", i, myint[i]);
	    }

	}

}
