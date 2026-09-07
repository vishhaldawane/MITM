import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//		//Stream<Song> stream = Stream.of(songArray);

public class StreamTest {
	public static void main(String[] args) {
	
		//content
		Song song1 = new Song("Dil Se Re","AR Rehman","Dil Se", 2001);
		Song song2 = new Song("Vande Mataram","AR Rehman","Maa Tujhe Salaam", 2000);
		Song song3 = new Song("I want it that way","Martin L","Backstreet Boys", 2005);
		Song song4 = new Song("Ab Mujhe Raat Din","Sonu Nigam","Deewana", 2004);
		Song song5 = new Song("Chaiya Chaiya","Sukhwinder Singh","Dil Se", 2003);
	
		//array as a container
		Song songArray[] = new Song [ 5 ];
		
		songArray[ 0 ] = song1; //assign object to the container element
		songArray[ 1 ] = song2;
		songArray[ 2 ] = song3;
		songArray[ 3 ] = song4;
		songArray[ 4 ] = song5;
		
		for(int i=0;i < songArray.length; i++) {
			System.out.println("song is "+songArray[i]);
		}
		System.out.println("-------");
		
		//how to convert an array into the list 
		
		//as if a pipeline		// as if a Water tank
		Stream<Song> myStream = Stream.of(songArray);
		
		myStream.forEach(  
				
					(mySong) -> {
						System.out.println("Song : "+mySong);
					}
				
		);
		
		
		
		//convert the pipeline(stream) into the arraylist
		/*List<Song> playList = 
				myStream.collect(Collectors.toList());
		
		for(Song theSong : playList) {
			System.out.println("Song : "+theSong);
		}*/
		
		
		
	/*	ArrayList<Song> playList = new ArrayList<Song>();
		playList.add(song1);
		playList.add(song2);
		playList.add(song3);
		playList.add(song4);
		playList.add(song5);
		
		for(Song theSong : playList) {
			System.out.println("Song : "+theSong);
		} */
		
		
		/*Song songArray [] = {
				new Song("Dil Se Re","AR Rehman","Dil Se", 2001),
				new Song("Vande Mataram","AR Rehman","Maa Tujhe Salaam", 2000),
				new Song("I want it that way","Martin L","Backstreet Boys", 2005),
				new Song("Ab Mujhe Raat Din","Sonu Nigam","Deewana", 2004),
				new Song("Chaiya Chaiya","Sukhwinder Singh","Dil Se", 2003)				
		};*/
		
		
	}
}

