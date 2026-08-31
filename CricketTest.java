class CricketTest
{
	public static void main(String args[])
	{
		System.out.println("Lets start Cricket....");
		Cricketer cricketer1 = new Cricketer(21,'M',"Sachin Tendulkar");
		cricketer1.showCricketer();
		cricketer1.hitSixer();
		cricketer1.hitSixer();
		cricketer1.hitSixer();
		cricketer1.hitSixer();
		cricketer1.hitSixer();
		
		cricketer1.showCricketer();
		
		cricketer1.hitBoundry();
		cricketer1.hitBoundry();
		cricketer1.hitBoundry();

		cricketer1.showCricketer();
	}
}

class Cricketer
{
	int age;
	char gender;
	String name;
	int totalScore;
	int numberOfSixers;
	int numberOfFourRuns;

	Cricketer(int a, char g, String n)
	{
		age = a;
		gender = g;
		name = n;
	}
	void showCricketer()
	{
		System.out.println("Age         : "+age);
		System.out.println("Gender      : "+gender);
		System.out.println("Name        : "+name);
		System.out.println("Sixers      : "+numberOfSixers);
		System.out.println("Fours       : "+numberOfFourRuns);
		System.out.println("Total Score : "+totalScore);
		System.out.println("-------------------------");

	}

	void hitSixer()
	{
		numberOfSixers = numberOfSixers + 1;
		totalScore = totalScore + 6;
	}
	void hitBoundry()
	{
		numberOfFourRuns += 1;
		totalScore += 4;
	}
	void singleRun()
	{
		totalScore = totalScore + 1;
	}

}
