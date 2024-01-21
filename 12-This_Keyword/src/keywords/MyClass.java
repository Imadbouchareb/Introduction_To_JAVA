package keywords;

public class MyClass {
	private int a, b;
	
	public MyClass(int a, int b) {//constructor parameter name same as member variable
		this.a = a;
		this.b = b;
	}
	
	public MyClass() {
		this(0,0); //it will call parameterized constructor with value 0 and 0
	}
	
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void display() {
		System.out.println("The value of a and b are: " + a + " and " + b);
	}
}
