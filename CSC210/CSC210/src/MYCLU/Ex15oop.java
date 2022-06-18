package MYCLU;

import java.util.Scanner;

public class Ex15oop {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);		
		circle circle1 = new circle(2.0, "red");
		circle1.printMyCircle();
		
		circle circle2 = new circle();
		circle2.radius = 6.0;
		circle2.area();
		circle2.color = "blue";
		circle2.printMyCircle();

	}

}

class circle{
	
	double radius;
	String color;
	
	//Constructor must have same name as class 
	public circle() {
		radius = 0.0;
		color = "White";
	}
	
	public circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	public double area() {
		double area = Math.PI * radius * radius;	
		return area;
	}
	
	public void printMyCircle() {
		System.out.println(area() + color);
	}
	
}
