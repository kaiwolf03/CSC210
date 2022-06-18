package MYCLU;

public class final_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Artist{
	
	private String name;
	private String birthYear;
	private String deathYear;
	
	
	
	public Artist() {
		
		name = "None";
		birthYear = "XXXX";
		deathYear = "0";
	}
	
	public void printInfo() {
		System.out.print(name + birthYear + deathYear);
	}
	
	
	
	
	
}


class Artwork{
	
	private String title;
	private int yearCreated;

	
	public Artwork() {
		title = "None";
		yearCreated = 0;
	}
}
