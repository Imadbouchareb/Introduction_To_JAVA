package classObject;

public class Student {
	String name;
	int id;
	String major;
	
	//member functions/methods declaration
	void setName(String stName) {//take the student name as string and assign to name variable
		name = stName;
	}
	void setMajor(String subject) {// Take major subject for the student and assign it 
		major = subject;
	}
	void display() {//display the all information of the student
		System.out.println("The student name: " + name);
		System.out.println("Student id: " + id);
		System.out.println("Major Subject: " + major);
		System.out.println();
	}

}
