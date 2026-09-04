
public class DivideTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		Calculator calci = new Calculator();
		calci.divide(10, 3);
		calci.divide(20, 0);
		calci.divide(50, 7);
		calci.divide(60, 6);
		calci.divide(70, 4);
		System.out.println("End main");
		
	}
}
class Calculator
{
	void divide(int x, int y)
	{
		System.out.println("-- Dividing ---");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		int z = x / y;
		System.out.println("z : "+z);
		System.out.println("-- Divided ---");

	}
}
