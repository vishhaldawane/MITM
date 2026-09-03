
public class ArrayOfObjects {
	public static void main(String[] args) {
		
		//below line there is no call given to the constuctor
		Book bunch[] = new Book [ 5 ]; // this is an array, and not objects
		//above line only [ ] brackets are used.
		// bunch[] means it is an array reference
		// Book [ 5 ] means it is holding 5 references to Book objects
		
		// now lets load object into the array one by one
		
		//below constructor is called.... and assigned to an index from 0 to 4
		bunch [ 0 ] = new Book(101,"Java","James",450.00f); //object assigned
		bunch [ 1 ] = new Book(102,"Python","Hal Elrod",550.00f);
		bunch [ 2 ] = new Book(103,"AIML","Peter Dsouza",500.00f);
		bunch [ 3 ] = new Book(104,"Oracle","Scott Mayers",750.00f);
		bunch [ 4 ] = new Book(105,"C++","Bjarne Stroustup",850.00f);
		
		for(int i=0; i < bunch.length; i++) {
			System.out.println("book is : "+ bunch[i]);
		}
		
	}
}
class Book
{
	private int bookNumber;
	private String name;
	private String author;
	private float price;
	
	public Book(int bookNumber, String name, String author, float price) {
		super();
		this.bookNumber = bookNumber;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
