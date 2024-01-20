package classObject;

public class classObject {
	public static void main(String[] args) {
		Student s1, s2; //declare two reference variable to point student type object
		s1 = new Student(); // s1 now points to the Student type object
		s2 = new Student(); // s2 pointing another object of student type
		
		//Use member variables and methods to use them
		s1.setName("Imad");
		s1.id = 1021;
		s1.setMajor("Data Science");
		
		s2.setName("Joy");
		s2.id = 1251;
		s2.setMajor("Computer Science");
		
		//display the student details
		s1.display();
		s2.display();
	}
}