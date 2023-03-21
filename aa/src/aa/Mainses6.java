package aa;

import java.util.ArrayList;
import java.util.List;

public class Mainses6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Mia",1,"CS");
		Student s2 = new Student("Priya",2,"GAT");
		Student s3 = new Student("Miya",1,"CS-STAT, CS-MAT");
		Student s4 = new Student("Mila",1,"MAT");
		Student s5 = new Student("Mia",1,"CSI");
		
		List<Student> cs_students = new ArrayList<Student>();
			cs_students.add(s1);
			cs_students.add(s2);
			System.out.println(cs_students);
		
		
		List<Student> gat_students = new ArrayList<Student>();
			gat_students.add(s3);
			gat_students.add(s4);
			gat_students.add(s5);
			
		
		Department CS = new Department("CS", cs_students);
		Department GAT = new Department("GAT", gat_students);
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(CS);
		departments.add(GAT);
		
		Institute institute = new Institute("SUNIB", departments);
		System.out.println("Total students in institute: "+ institute.getTotalStudentInInstitute());
			
		
	}

}
