//https://github.com/vishhaldawane/MITM
public class AbstractTest {
	public static void main(String[] args) {
		//Mammal mammal = new Mammal();
		Human human = new Human();
		human.giveBirth();
		human.think();
		human.eat();
		human.swim();
		human.fly();
		
		System.out.println("----------");
		
		Bat bat = new Bat();
		bat.giveBirth();
		bat.hangInvertly();
		bat.eat();
		bat.fly();
		
		System.out.println("----------");
		
		Dog dog = new Dog();
		dog.giveBirth();
		dog.sniff();
		dog.eat();
		dog.swim();
		
		
		System.out.println("----------");
		
		Whale whale = new Whale();
		whale.giveBirth();
		whale.swimAtDeepOcean();
		whale.eat();
		whale.swim();
	}
}
interface Swimming //<-- pure abstract class
{
	 void swim(); //by default abstract, public
}
interface Flying
{
	 void fly(); //by default abstract and public
}

abstract class Mammal
{
	abstract void giveBirth();//without code body | declaration
	
	void eat() { //with code body
		System.out.println("Mammal is eating...");
	}
}
class Human extends Mammal implements Swimming,Flying // can swim, can fly
{
	void giveBirth() { //implementation of the declaration
		System.out.println("Human giving birth...");
	}
	void think() {// thoughts -> electrical impluse + chemical discharge
		System.out.println("Human is thinking....");
	}
	void eat() { //with code body
		System.out.println("Human is eating..with fingers/spoon...");
	}
	public void fly() {
		System.out.println("Human is flying with paragliding...");
	}
	public void swim() {
		System.out.println("Human is swimming in deep ocean with  oxygen  cylinders");
	}
}
class Bat extends Mammal implements Flying //as well as a Bird
{
	void giveBirth() {
		System.out.println("Bat as a bird giving birth to another bat..");
	}
	void hangInvertly() {
		System.out.println("Bat is hanging invertly.....");
	}
	public void fly() {
		System.out.println("Bat is Flying with radio signals ..");
	}
	/*void eat() { //with code body
		System.out.println("Bat is eating..with mouth...");
	}*/
}
class Dog extends Mammal implements Swimming // can swim, but not necessarily to be a fish
{
	void giveBirth() {
		System.out.println("Dog is giving birth to puppies...");
	}
	void sniff() {
		System.out.println("Dog is sensing theft ....");
	}
	void eat() { //with code body
		System.out.println("Dog is chewing bone...");
	}
	public void swim() {
		System.out.println("Dog is swimming in the river..  ");
	}
	
}
class Whale extends Mammal implements Swimming // as well as  a Fish
{
	void giveBirth() {
		System.out.println("Whale Fish is giving birth to tiny whales");
	}
	void swimAtDeepOcean() {
		System.out.println("Swimming at the deep ocean....");
	}
	public void swim() {
		System.out.println("Whale can swim on the surface of the ocean....  ");
	}
	
	/*void eat() { //with code body
		System.out.println("Whale is eating..other smaller fish...");
	}*/
}

