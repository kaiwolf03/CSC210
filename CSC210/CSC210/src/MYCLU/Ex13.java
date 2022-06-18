package MYCLU;

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		
		System.out.println("Enter matrix1: ");
		
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				a[r][c] = input.nextDouble();
				
			}
		}
		
		System.out.println("Enter matrix2: ");
		
		for (int r = 0; r < b.length; r++) {
			for (int c = 0; c < b[r].length; c++) {
				b[r][c] = input.nextDouble();
				
			}
		}
		
		double[][] sum = new double[3][3];
		sum = addMatrix(a, b);
		
		
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + "\t");	
			}
			
			if (r == 0) {
				System.out.print("\t\t");
				
				for (int c = 0; c < a[r].length; c++) {
					System.out.print(b[r][c] + "\t");	
				}
				
                System.out.print("\t\t");
				
				for (int c = 0; c < a[r].length; c++) {
					System.out.print(sum[r][c] + "\t");	
				}
			}
			
			else if (r == 1) {
                System.out.print("+\t\t");
				
				for (int c = 0; c < a[r].length; c++) {
					System.out.print(b[r][c] + "\t");	
				}
				
                System.out.print("=\t\t");
				
				for (int c = 0; c < a[r].length; c++) {
					System.out.print(sum[r][c] + "\t");	
				}
			}
			
			else {
                System.out.print("\t\t");
				
				for (int c = 0; c < a[r].length; c++) {
					System.out.print(b[r][c] + "\t");	
				}
				
                System.out.print("\t\t");
				
				for (int c = 0; c < a[r].length; c++) {
					System.out.print(sum[r][c] + "\t");	
				}
			}
			
			
		}
		
		

	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] sum = new double[a.length][a[0].length];
		
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				sum[r][c] = a[r][c] + b [r][c];
			}
		}
		
		return sum;
	}

}
