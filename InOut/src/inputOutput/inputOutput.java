package inputOutput;

import java.util.Scanner;
public class inputOutput {
	public static void main(String[] args) {
		System.out.println("This is an output line");
		
		int x = 10;
		System.out.println("Value of x: " +x);
		
		System.out.print("First string");
		System.out.println("Second string");
		
		System.out.printf("This is the value of x = %d, PI = %f \n", x,22f/7);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter data using keyboard: ");
		int data = scanner.nextInt();//it will take integer as input value and store to data
		
		System.out.println("The data, that has been read: "+ data);
		
		scanner.close();
		
	}

}
