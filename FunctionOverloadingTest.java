
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		Calculator calci = new Calculator();
		calci.add(10, 20);
		calci.add(30, 40, 50);
		calci.add(45.6f, 78.5f);
		calci.add(30, 50.5f);
		calci.add(31.5F, 55);

	}

}
/*
   function overloading - we can develop multiple functions
   	with same name, but they must be differentiated based on
   			a. type of arguments
   			b. number of arguments
   			c. sequence of types of arguments
 */
class Calculator
{
	void add(int i, int j) {//method or function
		System.out.println("i "+i);
		System.out.println("j "+j);
		int k = i + j;
		System.out.println("Addition : "+k);
	}
	void add(float i, float j) {//method or function
		System.out.println("i "+i);
		System.out.println("j "+j);
		float k = i + j;
		System.out.println("Addition : "+k);
	}
	void add(int i, float j) {//method or function
		System.out.println("i "+i);
		System.out.println("j "+j);
		float k = i + j;
		System.out.println("Addition : "+k);
	}
	void add(float i, int j) {//method or function
		System.out.println("i "+i);
		System.out.println("j "+j);
		float k = i + j;
		System.out.println("Addition : "+k);
	}
	void add(int i, int j, int k) {//method or function
		System.out.println("i "+i);
		System.out.println("j "+j);
		System.out.println("k "+k);
		
		int sum = i + j + k;
		System.out.println("Addition : "+sum);
	}
}