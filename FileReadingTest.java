import java.awt.Frame;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;

class MyFileReader 
{
	FileInputStream fin;
	
	
	MyFileReader(String filename) {
		try {
			fin = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void readData() {
		try
		{
			byte b = (byte) fin.read(); //read the first letter from the file
			
			while(b != -1 ) { //-1 means to check the EOF
				System.out.print((char)b); //show the letter on the screen
				b = (byte) fin.read(); //read successive characters
				Thread.sleep(5); //slow motion
			}
			System.out.println("----------");
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exists : "+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void closeFile() {
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//CricketTest.java	Joker.java
//DataTypes.java		Studio.java


public class FileReadingTest {
	//Unhandled exception type FileNotFoundException
	public static void main(String[] args) {
		
		MyFileReader reader1 = new MyFileReader("/Users/admin/MITM/file1.txt");
		MyFileReader reader2 = new MyFileReader("/Users/admin/MITM/file2.txt");
		MyFileReader reader3 = new MyFileReader("/Users/admin/MITM/file3.txt");
		MyFileReader reader4 = new MyFileReader("/Users/admin/MITM/file4.txt");
		MyFileReader reader5 = new MyFileReader("/Users/admin/MITM/file5.txt");
		
	
		reader1.readData();
		reader2.readData();
		reader3.readData();
		reader4.readData();
		reader5.readData();
		
		reader1.closeFile();
		reader2.closeFile();
		reader3.closeFile();
		reader4.closeFile();
		reader5.closeFile();
		
	/*try
		{
			System.out.println("Trying to open the file...");
			// C:\yourfolder path here
			// C:\\MITM\\Java\\Day1.txt
			
			FileInputStream fin = new FileInputStream("/Users/admin/MITM/Day1.txt");
			System.out.println("Wow, the file is opened...");
			
			byte b = (byte) fin.read(); //read the first letter from the file
			
			while(b != -1 ) { //-1 means to check the EOF
				System.out.print((char)b); //show the letter on the screen
				b = (byte) fin.read(); //read successive characters
				Thread.sleep(5); //slow motion
			}
			System.out.println("Trying to close the file...");
			fin.close();
			System.out.println("File is closed....");
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exists : "+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
	/*	Frame f1 = new Frame();
		f1.setTitle("Madhura");
		f1.setSize(400,500);
		f1.setLocation(300, 400);
		f1.setVisible(true);
	
		
		Frame f2 = new Frame();
		f2.setTitle("Abhishek");

		f2.setSize(300,400);
		f2.setLocation(400, 800);
		f2.setVisible(true);
		
		Frame f3 = new Frame();
		f3.setTitle("Vishal");

		f3.setSize(200,300);
		f3.setLocation(700, 600);
		f3.setVisible(true);
	
		Frame f4 = new Frame();
		f4.setTitle("Rohan");

		f4.setSize(400,300);
		f4.setLocation(800, 900);
		f4.setVisible(true);
		
		Frame f5 = new Frame();
		f5.setTitle("Shreyas RP");

		f5.setSize(500,600);
		f5.setLocation(500, 600);
		f5.setVisible(true);*/
		
	/*	MyWindow mw1 = new MyWindow(400,500,300,400,"Madhura");
		MyWindow mw2 = new MyWindow(300,600,400,600,"Poorna");
		MyWindow mw3 = new MyWindow(600,300,500,700,"Amit");
		MyWindow mw4 = new MyWindow(700,600,600,800,"Amoghvarsha");
		MyWindow mw5 = new MyWindow(800,700,700,300,"Ajay");
		MyWindow mw6 = new MyWindow(350,800,200,450,"Abhishek");
		MyWindow mw7 = new MyWindow(450,550,400,350,"Chetan");
		MyWindow mw8 = new MyWindow(600,350,450,450,"Shreyas");
		MyWindow mw9 = new MyWindow(750,450,350,350,"Yashwant");
	*/	
	/*	for(int i=1;i<500;i+=5) {
			MyWindow mw10 = new MyWindow(750+i,450+i,350+i,350+i,"Yashwant");

		}
		*/
	}
	
}
/*
class MyWindow extends JFrame  //isA
{
	MyWindow(int width,int height, int x, int y, String title)
	{
		setSize(width,height);
		setLocation(x,y);
		setTitle(title);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
*/









