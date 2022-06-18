package MYCLU;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    int[] myint = new int[100];
	    int readInt;
	   
	    
	    System.out.print("Give input: ");
	    
	    int i = 0;
	    while (true) {
	    	readInt = input.nextInt();
	    	
	    	
	    	if (readInt == 0) {
	    		break;
	    	}
	    	else {
	    		myint[i] = readInt;
	    		i++;
	    	}
	    }
	    
	    
	    int myValue;
	    int counter = 1;
	    for (int a = 0; a < i ; a++) {
	    	
	    	
	    	myValue = myint[a];
	    	for (int n = 0; n < i; n++) {
	    		
	    		if (myValue == myint[n]) {
	    			counter++;
	    		}
	    		counter--;
	    		System.out.printf("%d occurs %d times\r\n", myValue, counter);
	    	}
	    	counter = 1;
	    	
	    }



	}

}
