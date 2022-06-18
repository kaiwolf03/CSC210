package MYCLU;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter integer: ");
		
		int num = 10;
		int posCount = 0;
		int negCount = 0;
		int total = 0;
		
		/*while(num != 0) {
			num = input.nextInt();
		}*/
		
		while(true) {
			num = input.nextInt();
			if (num == 0) {
				break;
			}
			else {
				total += num;
				
				if (num < 0) {
					negCount++;
				}
				else {
					posCount++;
				}
			}
		}
	}

}
