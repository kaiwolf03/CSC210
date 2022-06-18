package MYCLU;

import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 4x4 matrix row by row: ");
		
		double[][] m = new double[4][4];
		
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {
				m[r][c] = input.nextDouble();
				
			}
		}
		
		double sum = sumDiagonal(m);
		System.out.println(sum);
		

	}
	
	public static double sumDiagonal(double[][] m) {
		double result = 0.0;
		
		for (int r = 0; r < m.length; r++) {
			result += m[r][r];
		}
		
		return result;
	}

}
