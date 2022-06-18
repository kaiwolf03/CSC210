package MYCLU;

import java.util.Scanner;

public class midTerm2 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    
	    do {
	    
	    System.out.print("Enter String: ");
	    
		String s = input.nextLine();
		
		if (s.isEmpty()) {break;};
	    
	    System.out.println("The lower case count: " + getLowercaseCount(s));
	    
	    }while(true);

	}
	
	
	public static int getLowercaseCount(String s) {
		int num = 0;
		
		int length = s.length();
		
		for (int i = 0; i < length; i++) {
			
			
			if (Character.isLowerCase(s.charAt(i)) ) {
				num++;
				
			}
			
		}
		
		return num;
	}

}
