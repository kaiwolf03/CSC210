package MYCLU;

public class Ex18oop_tax {
	
	private int filingStatus;
	private int[][] brackets = new int[100][100];
	private double[] rates = new double[100];
	private double taxableIncome;
	
	public Ex18oop_tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	public Ex18oop_tax() { 
		//this();
	}
	
	public void setfilingSatus(int filingstatus) {
		this.filingStatus = filingStatus;
	}
	
	public void setbrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	
	public void setrates(double[] rates) {
		this.rates = rates;
	}
	
	public void settaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	public int getfilingSatus() {
		return this.filingStatus;
	}
	
	public int[][] getbrackets() {
		return this.brackets;
	}
	
    public double[] getrates() {
		return this.rates;
	}
    
	public double gettaxableIncome() {
		return this.taxableIncome;
	}
	
	
	
	public double getTax() {
		double tax = 0.0;
		return tax;
	}

}
