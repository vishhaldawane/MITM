import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		try
		{
			
			
			Scanner scanner1 = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			Scanner scanner3 = new Scanner(System.in);
			
			System.out.println("Enter roll no : ");
			int rollNumber = scanner1.nextInt();
	
			System.out.println("Enter name    : ");
			String name = scanner2.next();
	
			System.out.println("Enter marks   : ");
			float marks = scanner1.nextFloat();
			
			System.out.println("Roll No : "+rollNumber);
			System.out.println("Name    : "+name);
			System.out.println("Marks   : "+marks);
		}
		catch(InputMismatchException e) {
			System.out.println("Please supply valid values..."+e);
		}
	}
}
