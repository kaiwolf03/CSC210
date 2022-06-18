package MYCLU;

import java.util.*;

public class Homework8_1 {
	
	public static void main(String[] args) {
		
		//Make a array (3x3) that represents the tic tac toe board
		char[][] board = new char[3][3];
		
		//Initialize our board with dashes (empty positions)
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}

		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Create a player1 boolean that is true if it is player 1st turn and false if it is player 2nd turn
		boolean player1 = true;

		//Create a gameEnded boolean for the condition in the while-loop
		boolean gameEnded = false;
		while(!gameEnded) {

			//Draw the board
			drawBoard(board);

			//Create a char variable that stores either 'x' or 'o' dependent on what players turn it is
			char c = ' ';
			if(player1) {
				c = 'x';
			} else {
				c = 'o';
			}

			//Create row and col variables which represent indexes that is the position on the board
			int row = 0;
			int col = 0;

			//Only break out of the while loop once the user enters a valid position
			while(true) {
				
				//Ask the user for what position they want to place their x or o
				System.out.print("Enter a row (0, 1, or 2) for player " + c + ": ");
				row = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player " + c + ": ");
				col = input.nextInt();
				System.out.println("");

				//Check if the row and col are 0, 1, or 2
				if(row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("Invalid input (number too high or too small)! Try again.");
				
				//Check if the position on the board the user entered is empty or not
				} else if(board[row][col] != ' ') {
					System.out.println("That position is already taken! Try again.");
				
				//Otherwise the position is valid so break out of the while-loop
				} else {
					break;
				}
			
			}

			//Set the position on the board at row, col to c
			board[row][col] = c;

			//Check if either player has won
			if(playerHasWon(board) == 'x') {
				System.out.println("x player won:");
				gameEnded = true;
			} else if(playerHasWon(board) == 'o') {
				System.out.println("o player won:");
				gameEnded = true;
			} else {

				//Check if there is a tie (if the board is full)
				if(boardIsFull(board)) {
					System.out.println("It's a tie!");
					gameEnded = true;
				} else {
					//If player1 is true, make it false, or the other way, so that the players switch each turn
					player1 = !player1;
				}

			}

		}
		
		//Draw the board at the end of the game
		drawBoard(board);

	}
	
	
	//Make a function to draw the tic tac toe board
	public static void drawBoard(char[][] board) {
		
		System.out.println("-------------");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
		System.out.println("-------------");
		
	}
	
	
	
	//Make a function to see if someone has won and return the winning char
	public static char playerHasWon(char[][] board) {
		
		//Check each row
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
				return board[i][0];
			}
		}

		//Check each column
		for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
				return board[0][j];
			}
		}

		//Check the diagonals
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != ' ') {
			return board[2][0];
		}

		//Otherwise nobody has not won yet
		return ' ';

	}

	//Make a function to check if all of the positions on the board have been filled
	public static boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}


}
