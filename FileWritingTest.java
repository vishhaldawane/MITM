import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingTest {
	public static void main(String[] args) {
		
		//ctrl+shift+M short cut to import 
		try {
			System.out.println("Trying to open the file for writing...");

			FileOutputStream fout = new FileOutputStream("/Users/admin/MITM/princess.txt");
			
			System.out.println("File is ready to write the data....");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter data : ");
			String data = scan.nextLine();
			
			byte dataInArrayFormat[] = data.getBytes();
			System.out.println("Converted data into array format...");
			
			fout.write(dataInArrayFormat);
			System.out.println("Data is written to the file...");
			
			fout.close();
			System.out.println("File is closed...");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
