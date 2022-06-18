package MYCLU;

public class Ex7 {

	public static void main(String[] args) {
		
		for (int i = 100; i <= 200; i++) {
			
			int counter = 0;
			
			if (i % 5 == 0 && i % 6 != 0) {
				System.out.printf(i + "\t");
				counter++;
			}
			else if (i % 6 == 0 && i % 5 != 0) {
				System.out.printf(i + "\t");
				counter++;
			}
			
			if (counter > 9) {
				System.out.println(" ");
				counter = 0;
			}
		}

	}

}
