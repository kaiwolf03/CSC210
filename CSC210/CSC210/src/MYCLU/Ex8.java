package MYCLU;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    String time;
	    
	    System.out.println(convertMillis(550));

	}
	
	
	public static String convertMillis(long millis) {
		String results;
		
		int min = (int) (millis * 60000);
		int hour = (int) (millis * 3600000);
		
		results = hour + ";" + min;
		
		return results;
	}

}
