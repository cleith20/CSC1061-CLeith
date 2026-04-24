import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		
		//Creating stalls for animals, empty enclosures for animals
		Animal[] animals = new Animal[3];
		
		//List<whatGoesIntoTheList> nameOfList = new ArrayList<>();
		List<Animal> animList = new ArrayList<>();
		animList.add(new Cat("Scout", 8.6, 2.1, 4));
		
		animals[0] = new Cat("Mei", 9.5, 0.9, 2);
		animals[1] =  new Horse("BoJack", 100.5, 8.0, 50);
		animals[2] = new Dog ("Pochita", 40.0, 2.0, 3);
		
		Horse[] horses = new Horse[3];
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].makesSound());
		}
		//for each of the TYPE animal IN animals
		//one animal IN animals array
		for(Animal anim : animals) {
			System.out.println(anim.makesSound());
			printAnimal(anim);
		}
		
		
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
		System.out.println();
	}
	public static void printWithoutToString(Animal anim) {
		System.out.println("Name = " + anim.getName() + " Weight = " + anim.getWeight() 
						+ " Height = " + anim.getHeight());
		if(anim instanceof Cat) {
			//Type casting, converting animal down to cat
			//(subclass)superclass
			Cat thisCat = (Cat)anim;
			//int lengthOfWhiskers = ((Cat) anim).getLengthOfWhiskers();
			int lengthOfWhiskers = thisCat.getLengthOfWhiskers();
			System.out.println(" Length of Whisker = " + lengthOfWhiskers);
		}
		if(anim instanceof Dog) {
			System.out.println(" Bark Volume = " + ((Dog) anim).getBarkVol());
		}
		if(anim instanceof Horse) {
			System.out.println(" Speed = " + ((Horse) anim).getSpeed());
		}
		System.out.println();
					}

}
