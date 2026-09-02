
public class ThreadTest {
	public static void main(String[] args) {
		Bike bike = new Bike();//3 object of your thread
		Car car = new Car();//3
		Ship ship = new Ship();//3
		Train train = new Train();//3
		Aircraft airCraft = new Aircraft();//3
		
		
		bike.start(); //in-turn invokes run()
		car.start();
		ship.start();
		train.start();
		airCraft.start();
		
		/*bike.run();
		car.run();
		ship.run();
		train.run();
		airCraft.run();*/
		
		/*bike.ride();
		car.drive();
		ship.sail();
		train.track();
		airCraft.fly();*/
	}
}
class Bike extends Thread //implements Runnable//1
{
	void ride() {
		for(int i=1;i<=300;i++) {
			System.out.println("Bike is running...."+i);
		}
	}
	public void run() { //2. mandatory
		ride();
	}
}

class Car extends Thread // implements Runnable //1
{
	void drive() {
		for(int i=1;i<=300;i++) {
			System.out.println("\tCar is running...."+i);
		}
	}
	public void run() { //2
		drive();
	}
}

class Ship extends Thread // implements Runnable//1
{
	void sail() {
		for(int i=1;i<=300;i++) {
			System.out.println("\t\tShip is sailing...."+i);
		}

	}
	public void run() { //2
		sail();
	}
}

class Train extends Thread // implements Runnable //1
{
	void track() 
	{
		for(int i=1;i<=300;i++) {
			System.out.println("\t\t\tTrain is railing......"+i);
		}

	}
	public void run() { //2
		track();
		
	}
}
class Aircraft extends Thread // implements Runnable //1
{
	void fly() 
	{
		for(int i=1;i<=300;i++) {
			System.out.println("\t\t\t\tAircraft is flying...."+i);
		}

	}
	public void run() { //2
		fly();
	}
}
