package abstraction;

public class AbstractDemo{
	public static void main(String[] args) {
		Emp e = new Programmer();
		e.description();
		e.salary();
		
		e = new TesterEmp();
		e.description();
		e.salary();
	}
}