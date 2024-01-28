package abstraction;

abstract public class Emp {//no object can be generated of abstract class
	public void description(){
		System.out.print("It is an employee ");
	}
	abstract void salary();//abstract function has no body

}
class Programmer extends Emp{
	@Override
	public void description() {//override description method
		System.out.println("It is a Programmer");
	}
	@Override
	void salary() {//the salary must be defined in the child class
		System.out.println("Salary of programmer 25000");
	}
}

class TesterEmp extends Emp {
	@Override
	public void description() {//override description method
		super.description();//call description of parent class
		System.out.println("works as Tester");
	}
	@Override
	void salary() {//the salary must be defined in the child class
		System.out.println("Salary of Tester 35000");
	}
}
