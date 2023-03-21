package aa;

import java.util.List;

public class Employer {
	String name;
	String industry;
	
	private List<Person> person;
	
	Employer(String name, String industry, List<Person> person){
		this.name = name;
		this.industry = industry;
		this.person = person;
		
	}
	
	
}
