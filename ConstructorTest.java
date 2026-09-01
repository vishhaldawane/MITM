
public class ConstructorTest {
	public static void main(String[] args) {
		Person person1 = new Person('F',"Janet",23);
		
		person1.showPerson();
		person1.showPerson();
		person1.showPerson();
		
	}
}
/*
 		What is a constructor
 		
 			- it has the same name as of the class
 			- it does not have return type, eg, void / int
 			- it is invoked during object creation process
 			- it is executed only once per object
 			- it can take arguments
 			- it is used for the initialization of the object
 			- if it is not created by you, then JPL
 			  will provide an implicit constructor which
 			  does nothing
 			- either u can have implicit or explicit, but
 				not the both at the same time
 				
 */
class Sun
{
	
}

class Person
{
	char gender;
	String name;
	int age;
	
	Person(char g, String n, int a) {
		gender = g;
		name = n;
		age = a;
	}
	void showPerson() {
		System.out.println("---PERSONAL DATA----");
		System.out.println("gender : "+gender);
		System.out.println("name   : "+name);
		System.out.println("age    : "+age);
	}
}