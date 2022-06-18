package MYCLU;

public class Ex14 {

	public static void main(String[] args) {
		
		double r = 2.0;	
		radian(r);
		//double area = 0.0;		
		//area = Math.PI * r * r;
		//System.out.println(area);
		
		r = 6.0;
		radian(r);
        //area = Math.PI * r * r;		
		//System.out.println(area);
		
		

	}
	
	public static void radian(double r) {
		double area = Math.PI * r * r;
		System.out.println(area);
		
	}

}
