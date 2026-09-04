
public class StringExceptionTest {
	public static void main(String[] args) {
		
		//           0123456789
		try {
			String name="Maharaja Institute of Technology, Mysore";
		
			System.out.println("name "+name.toUpperCase());
			System.out.println("name "+name.toLowerCase());
			System.out.println("name "+name.charAt(0));
			System.out.println("name "+name.charAt(90));
			System.out.println("name "+name.charAt(22));
			System.out.println("name "+name.charAt(34));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index is out of range...");
		}
		
			
	}
}
