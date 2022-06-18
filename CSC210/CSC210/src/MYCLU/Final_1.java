package MYCLU;

import java.util.*;

public class Final_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			
			if (array[i] == -1) {
				selectionSortDescendTrace(array);
			}
		}

	}
	
	public static void selectionSortDescendTrace(int[] array) {
		
		Arrays.sort(array);
		Collections.reverse(array);
	}

}
