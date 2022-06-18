// Kai Wolf
// 02/17/2022
// A Fun Game with Letters
// Input: City, Country, Name, Animal, Food
// Output: Score




package MYCLU;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		char letter;
		String city;
		String country;
		String name;
		String animal;
		String food;
		int score = 0;
		
		System.out.println("Welcome to Fun Game with Letters");
		
		// Generate random Letter
		double num = Math.random() * 26 + 65;
		letter = (char) num;
		
		System.out.println("Instructions: enter a City, Food, A Person Name, Country, and Animal that contains the given letter. \n10 point if the first letter matches, 5 point if the middle letter matches, and 2 point if the last letter matches. Total score is 50 points. \nGiven letter is: " + letter);
		
		
		//City:

			// Read in City
			System.out.print("Enter a City name that contains " + letter + ": ");
			city = input.nextLine();
			
			// Trim
			city = city.trim();
			
			// Making city all big letters
			city = city.toUpperCase();
			
			// Finding string length
			int cityLength = city.length();
			
			// First character of the string
	        char cityFirst = city.charAt(0);
	        
	        // Last character of the string
	        char cityLast = city.charAt(cityLength - 1);
	        
	        // Middle character of the string
	        char cityMiddle = city.charAt((int) Math.ceil(cityLength / 2));
	        
	        // Score
	        if (cityFirst == letter) {
	        	score = score + 10;
	        }
	        else if (cityMiddle == letter) {
	        	score = score + 5;
	        }
	        else if (cityLast == letter) {
	        	score = score + 2;
	        }
	        
	        System.out.println("Intermediate score: " + score);
	        
	        
	        
		  //Country:

			// Read in Country
			System.out.print("Enter a Country name that contains " + letter + ": ");
			country = input.nextLine();
			
			// Trim
			country = country.trim();
			
			// Making country all big letters
			country = country.toUpperCase();
			
			// Finding string length
			int countryLength = country.length();
			
			// First character of the string
	        char countryFirst = country.charAt(0);
	        
	        // Last character of the string
	        char countryLast = country.charAt(cityLength - 1);
	        
	        // Middle character of the string
	        char countryMiddle = country.charAt((int) Math.ceil(countryLength / 2));
	        
	        // Score
	        if (countryFirst == letter) {
	        	score = score + 10;
	        }
	        else if (countryMiddle == letter) {
	        	score = score + 5;
	        }
	        else if (countryLast == letter) {
	        	score = score + 2;
	        }
	        
	        System.out.println("Intermediate score: " + score);
	        
	        
	        
	      //Name:

			// Read in Name
			System.out.print("Enter a Name that contains " + letter + ": ");
			name = input.nextLine();
			
			// Trim
			name = name.trim();
			
			// Making name all big letters
			name = name.toUpperCase();
			
			// Finding string length
			int nameLength = name.length();
			
			// First character of the string
	        char nameFirst = name.charAt(0);
	        
	        // Last character of the string
	        char nameLast = name.charAt(cityLength - 1);
	        
	        // Middle character of the string
	        char nameMiddle = name.charAt((int) Math.ceil(nameLength / 2));
	        
	        // Score
	        if (nameFirst == letter) {
	        	score = score + 10;
	        }
	        else if (nameMiddle == letter) {
	        	score = score + 5;
	        }
	        else if (nameLast == letter) {
	        	score = score + 2;
	        }
	        
	        System.out.println("Intermediate score: " + score);
	        
	        
	        
	      //Animal:

			// Read in Aniaml
			System.out.print("Enter a Animal name that contains " + letter + ": ");
			animal = input.nextLine();
			
			// Trim
			animal = animal.trim();
			
			// Making animal all big letters
			animal = animal.toUpperCase();
			
			// Finding string length
			int animalLength = animal.length();
			
			// First character of the string
	        char animalFirst = animal.charAt(0);
	        
	        // Last character of the string
	        char animalLast = animal.charAt(animalLength - 1);
	        
	        // Middle character of the string
	        char animalMiddle = animal.charAt((int) Math.ceil(animalLength / 2));
	        
	        // Score
	        if (animalFirst == letter) {
	        	score = score + 10;
	        }
	        else if (animalMiddle == letter) {
	        	score = score + 5;
	        }
	        else if (animalLast == letter) {
	        	score = score + 2;
	        }
	        
	        System.out.println("Intermediate score: " + score);
	        
	        
	        
	      //Food:

			// Read in Food
			System.out.print("Enter a Food name that contains " + letter + ": ");
			food = input.nextLine();
			
			// Trim
			food = food.trim();
			
			// Making food all big letters
			food = food.toUpperCase();
			
			// Finding string length
			int foodLength = food.length();
			
			// First character of the string
	        char foodFirst = food.charAt(0);
	        
	        // Last character of the string
	        char foodLast = food.charAt(foodLength - 1);
	        
	        // Middle character of the string
	        char foodMiddle = food.charAt((int) Math.ceil(foodLength / 2));
	        
	        // Score
	        if (foodFirst == letter) {
	        	score = score + 10;
	        }
	        else if (foodMiddle == letter) {
	        	score = score + 5;
	        }
	        else if (foodLast == letter) {
	        	score = score + 2;
	        }
	        
	        
        // Result
	        
	        if (score == 50) {
	        	System.out.println("Congratulations you win the highest score: " + score);
	        }
	        else {
	        	System.out.println("Congratulations your score is: " + score);
	        }

	}

}
