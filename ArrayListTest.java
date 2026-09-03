import java.util.ArrayList;//this line will avail that class
//java.util is a package from where it is available

public class ArrayListTest {
	public static void main(String[] args) {
		Song song1 = new Song("Dil Se Re","AR Rehman","Dil Se", 2001);
		Song song2 = new Song("Vande Mataram","AR Rehman","Maa Tujhe Salaam", 2000);
		Song song3 = new Song("I want it that way","Martin L","Backstreet Boys", 2005);
		Song song4 = new Song("Ab Mujhe Raat Din","Sonu Nigam","Deewana", 2004);
		Song song5 = new Song("Chaiya Chaiya","Sukhwinder Singh","Dil Se", 2003);
		
		//now dont store the above objects in the array
		
		//store them in a new container, called as array list
		
		//1. container is created
		ArrayList playList = new ArrayList();
		
		//2. now add each song in the container...
		playList.add(song1);
		playList.add(song2);
		playList.add(song3);
		playList.add(song4);
		playList.add(song5);
		//you can keep adding until the memory is full
		//there is no limit to add objects inside arraylist
		
		//now show all the songs
		
		for(int i=0; i<playList.size(); i++) {
			System.out.println("song is : "+playList.get(i));
		}
		//grab this code from git
		
	}
}
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
