package MYCLU;

import java.util.Scanner;

public class quiz1_1 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
		
	    String i = input.nextLine();
	    
	    // Making city all big letters
	 	i = i.toUpperCase();
	    
	    char first = i.charAt(0);
	    
	    
	    if (first == 'M') {
	    	System.out.print("Mathematics ");
	    }
	    else if (first == 'C') {
	    	System.out.print("Computer Science ");
	    }
	    else if (first == 'I') {
	    	System.out.print("Information Technology ");
	    }
	    
	    
	    char last = i.charAt(1);
	    
	    if (last == '1') {
	    	System.out.print("Freshman");
	    }
	    else if (last == '2') {
	    	System.out.print("Sophmore");
	    }
	    else if (last == '3') {
	    	System.out.print("Junior");
	    }
	    else if (last == '4') {
	    	System.out.print("Senior");
	    }

	}

}
