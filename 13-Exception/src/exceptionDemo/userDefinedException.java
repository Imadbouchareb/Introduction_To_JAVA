package exceptionDemo;

public class userDefinedException {
	public static void main(String[] args) {
		Application application1 = new Application("Imad", "JAVA Programming");
		Application application2 = new Application("Jhon", "Operating System");
		
		application1.displayDetails();
		
		try {
			application2.setAge(17);//this method may throw exception
		} catch (BelowAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
