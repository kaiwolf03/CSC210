package MYCLU;

public class Ex17oop_testAnimal {

	public static void main(String[] args) {
		
		Dog fieo = new Dog();
		
		fieo.setName("fieo");
		fieo.setSound("bark");
		fieo.displayInfo();
		
		Ex17opp_animalClass myAnimal = new Ex17opp_animalClass();
		System.out.println("Animal: " + myAnimal.getSound());
		
		System.out.println("Fieo: " + fieo.getSound());

	}

}
