//14:16   14:30
//you innovate one example like below

class Circus
{
	public static void main(String args[])
	{
		System.out.println("Circus is started....");
		RingMaster ringMaster = new RingMaster();
		ringMaster.instruct();
		ringMaster.instruct();
		ringMaster.instruct();
		Joker joker1 = new Joker();
		joker1.jumping();
		joker1.gigling();
	}
}
class RingMaster
{
	void instruct()
	{
		System.out.println("Ring master is instructing...");
	}
}
class Joker
{
	void jumping() 
	{
		System.out.println("Joker is jumping...");
	}
	void gigling() 
	{
		System.out.println("Joker is gigling...");
	}
}





