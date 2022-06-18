package MYCLU;

import java.util.Scanner;

public class midTerm1 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    String s = input.nextLine();
	    
	    System.out.print(getUppercaseCount(s));
	    
	    

	}
	
	public static int getUppercaseCount(String s) {
		int num = 0;
		
		int length = s.length();
		
		for (int i = 0; i < length; i++) {
			
			
			if (Character.isUpperCase(s.charAt(i)) ) {
				num++;
				
			}
			
		}
		
		return num;
	}

}
