package aa;
//part 1 
//Create several person objects set their instance variable and display proper relationship

import java.util.ArrayList;
import java.util.List;

public class Mainquiz {

	public static void main(String[] args) {
//		Address street, city, state
		Address a1 = new Address("Dango", "Inazuma", "Inazuma");
		Address a2 = new Address("Sakana", "Watatsumi", "Inazuma");
		Address a3 = new Address("McQueen", "DisneyCity", "Wonderland");
		Address a4 = new Address("Candy", "Forest", "Hanzel");
		Address a5 = new Address("Steam", "Clock", "Fontaine");
		
		List<Address> p1_address = new ArrayList<Address>();
		p1_address.add(a1);
		p1_address.add(a2);
		
		List<Address> p2_address = new ArrayList<Address>();
		p2_address.add(a3);
		p2_address.add(a4);
		p2_address.add(a5);
		
		//		Name, Age, Address
		Person p1 = new Person("Miho", 25, p1_address);
		Person p2 = new Person("Walt", 120, p2_address);
		
		List<Person> emp_game = new ArrayList<Person>();
		emp_game.add(p1); 
		emp_game.add(p2);
		
//		name, industry, employee
		Employer employer = new Employer("Jane", "Mobile Game", emp_game);	
		
		System.out.println("People employed by Jane are: ");
		for(Person p:emp_game) {
			System.out.println(p.name +", "+p.age+" years old.");
			
			
		}
		System.out.println("Below are the address of Miho:");
		for(Address a:p1_address) {
			System.out.println(a.street +" Street, "+ a.city +" City, "+ a.state);
			}	

	}

}
