// between 0 to 1 -> how many numbers are there?

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("1. Pandit is sitting...");
		System.out.println("2. Groom is sitting...");
		System.out.println("3. Groom parent are sitting..");
		System.out.println("4. Guest are sitting....");
		System.out.println("5. Pandit started chating...");
		System.out.println("6. Pandit calling the Bride");
	
		if(Math.random()%10 > 0.50) 
			throw new RuntimeException("Bride ran away with boy friend.. on Yamaha bike with ornaments and luggage......");

		System.out.println("7. Bride Arrived");

		if(Math.random()%10 > 0.75) 
			throw new RuntimeException("Bride and Pandit got married...");

		System.out.println("8. VarMaala to each other");
		System.out.println("9. Reception and dinner...");
		System.out.println("10. Marriage over...");
		
	}
}
