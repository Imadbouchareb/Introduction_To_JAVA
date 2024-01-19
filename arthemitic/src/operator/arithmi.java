package operator;

import java.util.Scanner;

public class arithmi {
	public static void main(String[] args) {
		int a, b, result;
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Entrer les valeur de a et b: ");
		
		a= scanner.nextInt();
		b= scanner.nextInt();
		
		result = a + b;
		System.out.println("Resultat apres Addition: "+result );

		result = a * b;
		System.out.println("Resultat apres Multiplication: "+result );		
		
		result = a - b;
		System.out.println("Resultat apres Soustraction: "+result );		
	
		result = a / b;
		System.out.println("Resultat apres Division: "+result );	

		result = a%b;
		System.out.println("Modulo: "+result );		
	}

}
