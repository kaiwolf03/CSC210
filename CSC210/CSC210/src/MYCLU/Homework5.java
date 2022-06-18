// Kai Wolf
// 02/27/2022
// Validate domain names with methods
// Input: domain name
// Output: If domain name is valid and if top-level domain is gTLD or just TLD



package MYCLU;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    String domain = "";
	    String tld = "";
	    String sld = "";
	    
	    int i = 0;
	    int length;
	    boolean x;
	    boolean y;
	    
	    
	    
	    
	    do {
	    
		    // Get input from user
		    System.out.print("Enter the next domain name (press enter to exit): ");
		    domain = input.nextLine();
		    
		    // Break when "enter"
            if(domain.isEmpty()) {
                break;
            }
		    
		    // Get length of domain
		    length = domainLength(domain);
		    
		    // Find the point (.) in the domain
		    i = point(i, domain);
		    
		    
		    
		    // Get TLD
		    tld = domain.substring(i, length);
		    
		    // Get second-level domain
		    sld = domain.substring(0, i);
		    
		    // Check second-level domain
		    x = secondLevel(i, sld);
		    
		    if (x) {
		    	System.out.print("\"" + domain + "\" is a valid domain name ");
		    	
		    	// check if TLD or gTLD
		    	y = gTLD(tld);
		    	
		    	if (y) {
		    		System.out.println("and has a core gTLD of \"" + tld + "\".\n");
		    	}
		    	else {
		    		System.out.println("and has a TLD of \"" + tld + "\".\n");
		    	}
		    	
		    }
		    else {
		    	System.out.println("\"" + domain + "\" is not a valid domain name.\n");
		    }
		    
	    
	    }
	    while(true);

	}
	
	
	public static int point(int i, String domain) {
		char point = 'a';
		
		while (point != '.') {
	    	point = domain.charAt(i);
	    	i++;
	    }
	    i = i - 1;
		
		return i;
	}
	
	
	public static boolean secondLevel(int i, String sld) {
		boolean x;
		
		if (sld.matches("^[a-zA-Z/]+$") && sld.charAt(0) != '/' && sld.charAt(i-1) != '/') {
			x = true;
		}
		else {
			x = false;
		}
		
		return x;
	}
	
	
	public static boolean gTLD(String tld) {
		boolean y;
		
		if (tld.equals(".com") || tld.equals(".net") || tld.equals(".org") || tld.equals(".info")) {
			y = true;
		}
		else {
			y = false;
		}
		
		return y;
	}
	
	
	public static int domainLength(String domain) {
		int length;
		
		length = domain.length();
		
		return length;
	}

}
