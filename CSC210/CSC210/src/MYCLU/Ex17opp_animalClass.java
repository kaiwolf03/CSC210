package MYCLU;

public class Ex17opp_animalClass {
	
	private String name;
	private int legs;
	private String food;
	public String sound;
	
	
	public Ex17opp_animalClass(String name, int legs, String food, String sound){
        this.name = name;
        this.legs = legs;
        this.food = food;
        this.sound = sound;
	}
	
	public Ex17opp_animalClass(){
		this("name", 0, "NA", "LOL");
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
	public String getFood() {
		return this.food;
	}
	
	public String getSound() {
		return this.sound;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}

}



class Dog extends Ex17opp_animalClass {
	
	public String sound;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, int legs, String food, String sound) {
		super(name, legs, food, sound);	
	}
	
	public void displayInfo() {
		System.out.println("The Animal name is: " + super.getName());
		System.out.println("The Animal Leg number is: " + super.getLegs());
		System.out.println("The Animal food is: " + super.getFood());
		System.out.println("The Animal sound is: " + super.getSound());
	}
	
	public void setSound(String sound) {
		//super.setSound(sound);
		this.sound = sound;
	}
	
}



class Cat extends Ex17opp_animalClass {
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int legs, String food, String sound) {
		super(name, legs, food, sound);	
	}
	
	public void displayInfo() {
		System.out.println("The Animal name is: " + super.getName());
		System.out.println("The Animal Leg number is: " + super.getLegs());
		System.out.println("The Animal food is: " + super.getFood());
		System.out.println("The Animal sound is: " + super.getSound());
	}
	
	public void setSound(String sound) {
		super.setSound(sound);
	}
	
}
