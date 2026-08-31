class Studio
{
	public static void main(String args[])
	{
		Photographer photographer = new Photographer();
		photographer.click();
		photographer.editPhoto();
		Camera cam = new Camera();
		cam.zoomIn();
		cam.zoomOut();
	}
}
class Photographer
{
	void click()
	{
		System.out.println("Photographer is clicking...");
	}
	void editPhoto()
	{
		System.out.println("Photographer is editing photo..");
	}
	
}

class Camera
{
	void zoomIn()
	{
		System.out.println("Camera zoomed in...");
	}

	void zoomOut()
	{
		System.out.println("Camera zoomed out...");
	}
}
