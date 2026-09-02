
public class AbstractTest {
	public static void main(String[] args) {
		//Mammal mammal = new Mammal();
		Human human = new Human();
		human.giveBirth();
		human.think();
		
		System.out.println("----------");
		
		Bat bat = new Bat();
		bat.giveBirth();
		bat.hangInvertly();
		
		System.out.println("----------");
		
		Dog dog = new Dog();
		dog.giveBirth();
		dog.sniff();
		
		System.out.println("----------");
		
		Whale whale = new Whale();
		whale.giveBirth();
		whale.swimAtDeepOcean();
	}
}
abstract class Mammal
{
	abstract void giveBirth();
}
class Human extends Mammal
{
	void giveBirth() {
		System.out.println("Human giving birth...");
	}
	void think() {
		System.out.println("Human is thinking....");
	}
}
class Bat extends Mammal
{
	void giveBirth() {
		System.out.println("Bat as a bird giving birth to another bat..");
	}
	void hangInvertly() {
		System.out.println("Bat is hanging invertly.....");
	}
}
class Dog extends Mammal
{
	void giveBirth() {
		System.out.println("Dog is giving birth to puppies...");
	}
	void sniff() {
		System.out.println("Dog is sensing theft ....");
	}
}
class Whale extends Mammal
{
	void giveBirth() {
		System.out.println("Whale Fish is giving birth to tiny whales");
	}
	void swimAtDeepOcean() {
		System.out.println("Swimming at the deep ocean....");
	}
}

