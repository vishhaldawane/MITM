import java.time.LocalDateTime;

public class AssociationTest {
	public static void main(String[] args) {
		/*Camera cam = new Camera(5,"Nikon");
		cam.showCamera();
		cam.zoomIn();
		cam.zoomIn();
		cam.zoomIn();
		cam.showCamera();
		cam.zoomOut();
		cam.showCamera();*/
		
		/*Photo photo = new Photo(300,200,true,LocalDateTime.now(), "Internal Storage");
		System.out.println("photo : "+photo);*/

	/*	LightEffect effect = new LightEffect("Sunny");
		System.out.println("light effect : "+effect);*/
		
	/*	Scene scene= new Scene("Birthday DP");
		System.out.println("scene : "+scene);*/
		
	/*	Person person = new Person('M',25,"Haresh");
		System.out.println("person : "+person);*/
		
		Photographer photographer = new 
				Photographer('M',38,"Haresh",20000,"Mumbai");
		System.out.println("photographer : "+photographer);
		photographer.cam.showCamera();
	}
}
class Person { 
	char gender;
	int age;
	String name;
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
	
}



class Camera {
	int zoomLevel; //1 to 10;
	String cameraBrand;
	
	Camera(int currentLevel, String cb) {
		zoomLevel = currentLevel;
		cameraBrand = cb;
	}
	
	void zoomIn() {
		System.out.println(cameraBrand+" cam is zoomed in...");
		zoomLevel++;
	}
	void zoomOut() {
		System.out.println(cameraBrand+" cam is zoomed out...");
		zoomLevel--;
	}
	void showCamera()
	{
		System.out.println("Camera     : "+cameraBrand);
		System.out.println("Zoom level : "+zoomLevel);
	}
}







class Photographer extends Person //isA
{
	int numberOfPhotosClicked;
	String address;
	
	public Photographer(char gender, int age, String name, int numberOfPhotosClicked, String address) {
		super(gender, age, name);
		this.numberOfPhotosClicked = numberOfPhotosClicked;
		this.address = address;
	}

	Camera cam = new Camera(5,"Nikon"); //hasA
	
		//producesA		usesA		usesA
			Photo click(Scene sc, LightEffect lf) {
			   return null;	
			}

			@Override
			public String toString() {
				return "Photographer [toString()=" + super.toString() + ", numberOfPhotosClicked="
						+ numberOfPhotosClicked + ", address=" + address + ", cam=" + cam + "]";
			}
			
			
	
}
class Photo {
	int height;
	int width;
	boolean color; //false
	LocalDateTime creationDate;
	String location; //memorycard/internal storage
	public Photo(int height, int width, boolean color, LocalDateTime creationDate, String location) {
		super();
		this.height = height;
		this.width = width;
		this.color = color;
		this.creationDate = creationDate;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Photo [height=" + height + ", width=" + width + ", color=" + color + ", creationDate=" + creationDate
				+ ", location=" + location + "]";
	}
	
	
	
}
class Scene { 
	
	String content;

	public Scene(String content) {
		super();
		this.content = content;
	}

	@Override
	public String toString() {
		return "Scene [content=" + content + "]";
	}
	
	
}

class LightEffect  { 
	String effectType; // bright, shadow, sunny, cloudy..

	public LightEffect(String effectType) {
		super();
		this.effectType = effectType;
	}

	@Override
	public String toString() {
		return "LightEffect [effectType=" + effectType + "]";
	}
	
}











































