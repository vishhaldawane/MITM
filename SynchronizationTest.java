/*
 * 
 * 
 ITC
  Inter-thread communication
  
 */
public class SynchronizationTest {
	public static void main(String[] args) {
		
		FruitBowl fruitBowl = new FruitBowl();
		Producer producer = new Producer(fruitBowl);//3
		Consumer consumer = new Consumer(fruitBowl);//3
		
	
		consumer.start();
		producer.start();
		
		//producer.produce();
		//consumer.consume();
	}
}

//2 threads will operate on this object
class FruitBowl
{
	boolean isProduced; //by default false
	
	synchronized void produce() //invoked by Producer Thread
	{
		if(isProduced==false) {
			isProduced=true;
			for(int i=1;i<=30;i++) {
				System.out.println("Created FruitBowl...."+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Notifying the customer who is waiting....");
			notify();
		}
		
	}
	synchronized void consume() // invoked by Consumer Thread
	{
		if(isProduced==false)
			try {
				System.out.println("Consumer : is waiting for the producer...");
				wait(); //blocked here, 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //wait forever
		
		for(int i=1;i<=30;i++) {
			System.out.println("\tConsumed FruitBowl...."+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Producer extends Thread //1
{
	FruitBowl fb; //just a reference, not an object
	
	Producer(FruitBowl fb) {
		this.fb = fb;
	}
	public void run() { //2
		fb.produce();
	}
}
class Consumer extends Thread//1
{
	FruitBowl fb;
	
	Consumer(FruitBowl fb) {
		this.fb = fb;
	}
	
	public void run() { //2
		fb.consume();
	}
}