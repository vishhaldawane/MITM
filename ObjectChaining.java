//Cow -> Milk -> coagulation -> Curd -> churning-> Butter-> boil -> Tuppa/ClarifiedButter
// make the Lassi, ButterMilk, CurdRice, Tea, Coffee, 
// Mosarubajji wherver applicable

public class ObjectChaining {
	public static void main(String[] args) {
		
		/*Cow myCow = new Cow();
		
		Milk gotTheMilk = myCow.milkACow(20);
		
		Curd curd = gotTheMilk.coagulate();
		
		Butter butter = curd.churning();
		
		Ghee ghee = butter.boil();
		
		ghee.wow();*/
		Ghee ghee = new Cow().milkACow(25).coagulate().churning().boil();
		
	}
}
class Cow
{
	Milk milkACow(int minutes)//promise to return Milk's Object
	{
		System.out.println("Milking the Cow....");
		Milk milk = new Milk();
		return milk;
	}
}
class Milk
{
	Curd coagulate() //promise to produce Curd's Object
	{
		System.out.println("Coagulating...the Milk....");

		Curd curd = new Curd();
		return curd;
	}
}
class Curd
{
	Butter churning() //promise to produce the Butter's object
	{
		System.out.println("Churning...the Curd....");

		Butter butter = new Butter();
		return butter;
	}
}

class Butter
{
	Ghee boil() //promise to produce Ghee's object
	{
		System.out.println("boiling...the butter....");
		Ghee ghee = new Ghee();
		return ghee;
	}
}
class Ghee
{
	void wow()
	{
		System.out.println("Wow, we got the ghee....");
	}
}









