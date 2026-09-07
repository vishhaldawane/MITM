/*
 * 
 * 
 * 	Doctor (GrandFather)
 *     |
 *     Surgeon (Father)
 *     		|
 *     		HeartSurgeon (Child)
 */
public class LambdaTest {
	public static void main(String[] args) {
		
	/*	GrandFather gf = new GrandFather();
		gf.farming();
		
		System.out.println("-----");
				
		
		Father father = new Father();
		father.farming();
		father.banking();
		
		System.out.println("-----");
		
		Child child = new Child();
		child.farming();
		child.banking();
		child.coding();*/
		
		/*Child x = null;
		x.farming();
		x.banking();
		x.coding();*/
		
		/*Fighting x = new GrandFather();
		
		x.fight();
		
		x = new Soldier();
		
		x.fight();
		
		x = new Citizen();
		
		x.fight();*/
		
		Fighting x = () -> {
			System.out.println("Girl is fighting for computer and chair...");
		};
		
		x.fight();
		
		x = () -> {
			System.out.println("Girl is fighting for coupon in the canteen...");
		};
		
		x.fight();
		
		x = () -> {
			System.out.println("Girl is fighting for idli at the serving counter...");
		};
		
		x.fight();
		
	}
}

	
/*	
	() {
		System.out.println("Girl is fighting for the computer and the chair.......");
	}
*/
interface Fighting
{
	void fight();
}

class Soldier implements Fighting {
	public void fight() {
		System.out.println("Soldier  is fighting at the border.......");
	}
}
class Citizen implements Fighting {
	public void fight() {
		System.out.println("Indian Citizen is fighting for the seat in the bus.......");
	}
}
class GrandFather implements Fighting
{
	void farming() { //overridden
		System.out.println("Grand father is farming..using bulls.");
	}
	public void fight() {
		System.out.println("GrandFather is fighting for the freedom of the country....");
	}
}
class Father extends GrandFather
{
	void banking() {
		System.out.println("Father is banking...");
	}
	void farming() { //re-write the function of parent | overriding
		System.out.println("Father is farming...using tractor...");
	}
	public void fight() {
		System.out.println("Father is fighting for the Union of the bank...");
	}
}
class Child extends Father
{
	void coding() {
		System.out.println("Child is coding...");
	}
	void farming() { //re-write the function of parent | overriding
		System.out.println("Child is farming...using AI tractor...");
	}
	void banking() {
		System.out.println("Child is banking..using AI models....");
	}
	public void fight() {
		System.out.println("Child is fighting on the AI games ....");
	}
}

























interface Listening
{
	void listen();
}
interface Responding
{
	void respond();
}
interface Reacting 
{
	void react();
}
interface Studying 
{
	void study();
}
interface Walking 
{
	void walk();
}
interface Writing 
{
	void write();
}
interface Reading 
{
	void read();
}

class Student implements Reacting,Responding,Writing,Walking,Reading,Studying, Listening{

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respond() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void react() {
		// TODO Auto-generated method stub
		
	}
	
	
}
//Tiger Dog Student




/*
 

  
*/
