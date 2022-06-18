// Kai Wolf
// 03/03/2022
// Math Learning Tool 
// Input: practice category, operator, and result
// Output: Exercise calculation based on practice category and operator, and result is not correct.



package MYCLU;

import java.util.Scanner;
import java.util.*;

public class Homework6 {
	
	
	public static String format(String str) {
		// To Upper case
	    str = str.toUpperCase();
	    
	    // trim
	    str = str.trim();
		
		return str;
	}
	
	
	public static double cat(String category) {
		double upper;
		
		// Select range based on category
		if (category.matches("SIMPLE")) {
	    	upper = 10.00;
	    }
	    else if (category.matches("MEDIUM")) {
	    	upper = 1000.00;
	    }
	    else if (category.matches("HARD")) {
	    	upper = 10000.00;
	    }
	    else {
	    	System.out.println("Invalid input!");
	    	upper = 0.00;
	    }
		
		return upper;
	}
	
	
	public static double roundNums(double num, String category) {
		
		// Round number based on category
		if (category.matches("SIMPLE")) {
	    	num = Math.round(num);
	    }
	    else if (category.matches("MEDIUM")) {
	    	num = Math.round(num * 100.0) / 100.0;
	    }
	    else if (category.matches("HARD")) {
	    	num = Math.round(num * 100.0) / 100.0;
	    }
		
		return num;
	}
	
	
	public static double oper(String operator, double x, double y) {
		double result;
		
		// Select range based on category
		switch (operator) {
			case "+": result = x + y;
			break;
			case "-": result = x - y;
			break;
			case "/": result = x / y;
			break;
			case "*": result = x * y;
			break;
			case "%": result = x % y;
			break;
			default: System.out.println("Invalid input!");
				result = 100000.00;
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		
		// Create a Scanner
	    Scanner input = new Scanner(System.in);
	    
	    
	    String category;
	    String operator;
	    
	    double upper = 0.00;
	    
	    double x;
	    double y;
	    double result;
	    double userResult;
	    
	    String goOn;
	    
	    int score = 0;
	    
	    
	    do {
	    
	    // Score
	    System.out.println("Your score is: " + score + "\n");
	    
	    
	    
	    
	    // Get practice category
	    System.out.print("Would you like (Simple, Medium or Hard) problem? ");
	    category = input.nextLine();
	    
	    // format
	    category = format(category);
	    
	    // range
	    upper = cat(category);
	    
	    if (upper == 0.00) {
	    	continue;
	    }
	    
	    // Generate two random numbers in range
	    x = (Math.random() * (upper * 2)) - upper;
	    y = (Math.random() * (upper * 2)) - upper;
	    
	    // round the numbers
	    x = roundNums(x, category);
	    y = roundNums(y, category);
	    
	    
	    
	    
		
	    // Get operator
	    System.out.print("What would like to practice today (+, -. /, *, %)? ");
	    operator = input.nextLine();
	    
	    // format
	    operator = format(operator);
	    
	    // Calculate result
	    result = oper(operator, x, y);
	    
	    if (result == 100000.00) {
	    	continue;
	    }
	    
	    result = Math.round(result * 100.0) / 100.0;
	    
	    
	    
	    
	    // Get result from user
	    System.out.print("What is the answer to (" + x + operator + "(" + y + "))? ");
	    
	    
	    
	    try {
	    	
		    userResult = input.nextDouble();
	    
		    // Check the user result
		    if (userResult == result) {
		    	// add point to score
		    	score++; 
		    	
		    	System.out.print("Good job your answer is correct! You earned 1 point.\nWould you like to continue? (yes or no) ");
		    	
		    	goOn = input.nextLine();
		    }
		    else {
		    	System.out.print("Your answer is wrong, the correct answer should be " + result + "! You earned 0 point.\nWould you like to continue? (yes or no) ");
		    	
		    	goOn = input.nextLine();
		    }
	    
	    }
	    catch (InputMismatchException e) {
	    	System.out.print("Invalid input! Would you like to continue? (yes or no) ");
	    	goOn = input.nextLine();
	    }
	    
	    
	    //continue?
	    
	    goOn = input.nextLine();
    	
    	// format input
    	goOn = format(goOn);
    	
    	if (goOn.matches("YES")) {
    		continue;
    	}
    	else if (goOn.matches("NO")) {
    		break;
    	}
    	else {
    		System.out.println("Invalid input!");
    		continue;
    	}
	    
	    
	    
	    }while(true);
	    
	}

}
