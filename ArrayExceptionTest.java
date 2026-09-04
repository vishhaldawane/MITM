
public class ArrayExceptionTest {
	public static void main(String[] args) {
		
		int array[] = {10,20,30,40,50};
		
		try {
			System.out.println("array0 : "+array[0]);
			System.out.println("array1 : "+array[1]);
			
			System.out.println("array2 : "+array[8]);
			
			System.out.println("array3 : "+array[3]);
			System.out.println("array4 : "+array[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index..");
		}
		System.out.println("End of main");
	}
}
