package aa;
 
import java.util.List;

public class Person {
	String name;
	int age;
	private List<Address> address;
	
	Person(String name, int age, List<Address> address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
}
