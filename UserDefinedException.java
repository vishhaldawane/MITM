
public class UserDefinedException {
	public static void main(String[] args) {
		Car car = new Car();
		
		////try catch is mandatory for checked category
		
		try
		{
			car.startCar();
			car.longDrive();
		}	
		catch(SpeedLimitException e) { //unchecked category
			System.out.println(e.getMessage());
		}
		catch(TyrePuncturedException e) {//unchecked category
			System.out.println(e.getMessage());			
		}
		catch(SpeedBrakerException e) {//unchecked category
			System.out.println(e.getMessage());
		}
		catch (CarKeyMissingException e) {//checked category
			System.out.println("Car key is missing...");
		}
		System.out.println("Journey is over.. main is over..");
	}
}
class Car
{
	boolean keyFound; //by default false
	
	Car() {
		System.out.println("1. Car is created");
		double value = Math.random()%10;
		if(value >0.65) {
			keyFound = true; 
		}
			
	}
	
	//what is the difference between throw and throws
	
	void startCar() throws CarKeyMissingException//mandatory line for checked
	{								//exceptions
		if(keyFound) {
			System.out.println("2. Car started...");
		}
		else {//Unhandled exception type Exception
			throw new CarKeyMissingException("Car key is missing....");
		}
		
	}
	
	void longDrive()
	{
		System.out.println("3. long drive started...");

		for(int i=1;i<=170;i++) {
			
			double value = Math.random()%10;
			System.out.println("\tKm crossed..."+i);//+ " value "+value);

			if(value > 0.98) {//for speed limit
				//throw new RuntimeException("Some Problem1...");
				throw   new SpeedLimitException("Oh No!, Speed limit exceeded...now challan will come...");
			}

			
			if(value > 0.10 && value < 0.11 ) {//for tyre puncture 
				//throw new RuntimeException("Some Problem2...");
				throw   new TyrePuncturedException("Oh No!!, I guess tyre is punctured....we have to repair it.....");

			}
			
			if(value > 0.50 && value < 0.51 ) {//for speed braker... 
				//throw new RuntimeException("Some Problem3...");
				throw   new SpeedBrakerException("Oh No!!!, I could not see the speed braker....my car suspensions are at risk...");

			}

		}
		
		System.out.println("4. long drive over...");

	}
}

class SpeedLimitException extends RuntimeException //isA
{
	SpeedLimitException(String msg) {
		super(msg);
	}
}
class TyrePuncturedException extends RuntimeException //isA
{
	TyrePuncturedException(String msg) {
		super(msg);
	}
}

class SpeedBrakerException extends RuntimeException //isA
{
	SpeedBrakerException(String msg) {
		super(msg);
	}
}

//checked category
class CarKeyMissingException extends Exception //isA
{
	CarKeyMissingException(String msg) {
		super(msg);
	}
}








