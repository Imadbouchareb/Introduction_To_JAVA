package vecteur2D;

public class Vecteur2D {
	private double x,y;
	private static int nombreVecteurs = 0;
	
	public Vecteur2D(double x, double y) {
		this.x = x;
		this.y = y;
        nombreVecteurs++;
	}
	public void display() {
		System.out.println("la valeur de x:" + x );
		System.out.println("la valeur de y:" + y );
	}
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	public static int getNombreVecteurs() {
		return nombreVecteurs;
	}	
	public void setVec(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return  "x= " + x + ", y = " + y ;	
	}
	public boolean equals() {
		return this.x == this.y;
	}
	public double norme() {
		return Math.sqrt((x*x)+(y*y));
	}

}