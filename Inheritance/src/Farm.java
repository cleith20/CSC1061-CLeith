
public class Farm {

	public static void main(String[] args) {
		Cat cat1 = new Cat(5);
		System.out.println(cat1);
		System.out.println(cat1.makesSound());
		
		Cat cat2 = new Cat("Paris", 6.5, 0.9, 2);
		System.out.println(cat2);
		System.out.println(cat2.makesSound());
		
		Dog dog1 = new Dog("Fido", 40.0, 2.0, 3);
		System.out.println(dog1);
		System.out.println(dog1.makesSound());
		
		Horse horse1 = new Horse ("No Name", 100.5, 8.0, 50);
		System.out.println(horse1);
		System.out.println(horse1.makesSound());
		
		printAnimal(horse1);
	}
	
	public static void printAnimal(Animal anim) {
		System.out.println(anim);
	}

}
