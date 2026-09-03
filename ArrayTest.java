
public class ArrayTest {
	public static void main(String[] args) {

		int x=10;
		int y=20;
		int z=30;
					   //0 1  2  3   4 <-- index number
		int numbers[]= {10,20,30,40,50};
		//length is 5
		
		/*
		 * 	Array = group of variables | 10 20 30 40 50
		 * 			of similar data types - int 
		 * 			stored in consecutive memory
		 * 			referred by a common name - numbers
		*/
		System.out.println("numbers "+numbers[0]);
		System.out.println("numbers "+numbers[1]);
		System.out.println("numbers "+numbers[2]);
		System.out.println("numbers "+numbers[3]);
		System.out.println("numbers "+numbers[4]);
		System.out.println("-----");
		for(int i=0; i < numbers.length; i++) {
			System.out.println("numbers : "+numbers[i]);
		}
	}
}

