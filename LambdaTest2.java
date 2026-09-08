
public class LambdaTest2 {
	public static void main(String[] args) {
		
		//Class handle is pointing to the object
		/*Calculator1 calci1 = new Calculator1();
		Calculator2 calci2 = new Calculator2();
		Calculator3 calci3 = new Calculator3();
		Calculator4 calci4 = new Calculator4();*/
		
		//interface handle is pointing to the object
	/*	Calculating calci1 = new Calculator1();
		Calculating calci2 = new Calculator2();
		Calculating calci3 = new Calculator3();
		Calculating calci4 = new Calculator4();
		
		
		float output1 = calci1.calculate(10, 2);
		float output2 = calci2.calculate(10, 2);
		float output3 = calci3.calculate(10, 2);
		float output4 = calci4.calculate(10, 2);
		
		System.out.println("output1 : "+output1);
		System.out.println("output2 : "+output2);
		System.out.println("output3 : "+output3);
		System.out.println("output4 : "+output4);*/
		
		Calculating calci1 = ( i,  j) -> { return i+j; } ;
		Calculating calci2 = ( i,  j) -> { return i-j; } ;
		Calculating calci3 = ( i,  j) -> { return i*j; } ;
		Calculating calci4 = ( i,  j) -> { return i/j; } ;
			  
		
		float output1 = calci1.calculate(10, 20);
		float output2 = calci2.calculate(10, 20);
		float output3 = calci3.calculate(10, 20);
		float output4 = calci4.calculate(10, 20);
		
		System.out.println("output1 : "+output1);
		System.out.println("output2 : "+output2);
		System.out.println("output3 : "+output3);
		System.out.println("output4 : "+output4);
	}
}
interface Calculating // <-- this is your regular interface
{
	float calculate(float i, float j);
}
//Hemant
class Calculator1 implements Calculating { // <-- this is implementation of the interface
	public float calculate(float i, float j)
	{
    	return i+j;
	}
	void doSome() { }
	void load() { }
	void upload() { }
}

//Poorna
class Calculator2 implements Calculating { // <-- this is implementation of the interface
	public float calculate(float i, float j)
	{
    	return i-j;
	}
}

//Rohan
class Calculator3 implements Calculating { // <-- this is implementation of the interface
	public float calculate(float i, float j)
	{
    	return i*j;
	}
}

//Amoghvarsha
class Calculator4 implements Calculating { // <-- this is implementation of the interface
	public float calculate(float i, float j)
	{
    	return i/j;
	}
}

