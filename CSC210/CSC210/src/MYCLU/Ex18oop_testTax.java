package MYCLU;

public class Ex18oop_testTax {

	public static void main(String[] args) {
		
		int fStatus = 1;
		double[] rates = {0};
		int[][] brkt = {{0},{0}};
		double taxableIncome = 0.0;
		
		
		Ex18oop_tax tax1 = new Ex18oop_tax(fStatus, brkt, rates, taxableIncome);
		System.out.println(tax1.getTax());
		

	}

}
