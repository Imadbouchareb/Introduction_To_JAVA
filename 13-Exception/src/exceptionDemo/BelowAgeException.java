package exceptionDemo;

class BelowAgeException extends Exception {//exception where given age is below age 18
	BelowAgeException(){
		super("Age is under 18"); //message for the exception
	}
}

class Application {
	private String name;
	private String course;
	private int age;
	public Application(String name, String course) { //Set name and course to given values
		this.name = name;
		this.course = course;
		age = 18; //default age is 18
	}
	public Application(){//Set name and course to empty string
		this("", "");
	}
	public void setAge(int age) throws BelowAgeException{//this method can throw BelowAgeException
		//when the age is below 18, it throws exception
		if(age < 18)
			throw new BelowAgeException();
		else
			this.age = age;
	}
	public void displayDetails() {
		System.out.println("The name of the student: " + name);
		System.out.println("Applied for " + course);
		System.out.println("Applicant's Age: " + age);
		System.out.println();
	}
}