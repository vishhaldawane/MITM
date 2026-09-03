import java.util.ArrayList;//this line will avail that class
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

//java.util is a package from where it is available

public class ArrayListTest {
	public static void main(String[] args) {
		// LOOK AT THE 5 OBJECTS BELOW - THAT IS THE CONTENT
		Song song1 = new Song("Dil Se Re","AR Rehman","Dil Se", 2001);
		Song song2 = new Song("Vande Mataram","AR Rehman","Maa Tujhe Salaam", 2000);
		Song song3 = new Song("I want it that way","Martin L","Backstreet Boys", 2005);
		Song song4 = new Song("Ab Mujhe Raat Din","Sonu Nigam","Deewana", 2004);
		Song song5 = new Song("Chaiya Chaiya","Sukhwinder Singh","Dil Se", 2003);
		//ALL THE COMMENTS ARE THE EXPLAINATIONS
		
		
		//now dont store the above objects in the array
		
		//store them in a new container, called as array list
		
		//BELOW IS THE CONTAINER THAT WILL HOLD THE CONTENT
		//1. container is created
		//ArrayList playList = new ArrayList();
		
		//add this line at the top->import java.util.LinkedList;

		//LinkedList  playList = new LinkedList();
		
		//lets use HashSet now
		
		HashSet  playList = new HashSet();
		
		//output is same, but the Data Structure is changed
		
		//2. now add each song in the container...
		playList.add(song1); //ADDING CONTENT IN THE CONTAINER
		playList.add(song2);
		playList.add(song3);
		playList.add(song4);
		playList.add(song5);
		//you can keep adding until the memory is full
		//there is no limit to add objects inside arraylist
		
		//now show all the songs
		
		//BELOW WE ARE TRYING TO SHOW THE CONTENT 
		//FROM THE CONTAINER
		
		/*
		for(int i=0; i<playList.size(); i++) {
			System.out.println("song is : "+playList.get(i));
		}*/
		
		//WE CANNOT USE GET METHOD FOR HashSet
		//Use Iterator now
		
		//import java.util.Iterator;
		Iterator iterator = playList.iterator();
		while(iterator.hasNext())
		{
			Song song = (Song) iterator.next();
			System.out.println("Song : "+song);
		}
		
		
		//grab this code from git
		
	}
}
//LOOK AT THIS NEW EXPLAINATION

//ONCE YOU PRACTICE THIS EXAMPLE, THEN TRY TO ADD THE 
//SAME OBJECTS IN THE 
//1. LinkedList class
//2. TreeSet and 
//3. HashSet class 
//PRACTICE NOW
class Song
{
	String title;
	String artist;
	String album;
	int year;
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	
	
}
//wow hemant, use chatgpt to know other classes
//i liked it


















