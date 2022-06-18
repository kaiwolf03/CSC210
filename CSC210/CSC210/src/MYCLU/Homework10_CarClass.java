/* 
 Kai Wolf
 04/19/2022
 Project: The Car class
 Input: There is no user input because it is a test program, but I could change the program to make the user input model year of the car, purchase price of the car, current year.
 Output: model year, purchase price, and current value
*/



package MYCLU;

public class Homework10_CarClass {
	
	private int modelYear;
	private int currentValue;
	private double purchasePrice;
	
	
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	public int getModelYear() {
		return this.modelYear;
	}
	
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public void calcCurrentValue(int year) {
		int age = year - modelYear;
		currentValue = (int) Math.round(purchasePrice * Math.pow(0.85, age));
	}
	
	public void printInfo() {
		System.out.println("Car's information:");
		System.out.println("   Model year: " + modelYear);
		System.out.println("   Purchase price: " + purchasePrice);
		System.out.println("   Current value: " + currentValue);
	}

}
