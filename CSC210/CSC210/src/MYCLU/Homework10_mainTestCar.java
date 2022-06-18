package MYCLU;

public class Homework10_mainTestCar {

	public static void main(String[] args) {
		
		Homework10_CarClass car1 = new Homework10_CarClass();
		
		car1.setModelYear(2011);
		car1.setPurchasePrice(18000);
		car1.calcCurrentValue(2018);
		car1.printInfo();

	}

}
