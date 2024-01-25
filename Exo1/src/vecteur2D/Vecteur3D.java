package vecteur2D;

public class Vecteur3D extends Vecteur2D {
	private double z;
	
	public Vecteur3D(double x, double y, double z) {
		super(x,y);
		this.z = z;
	}
	public double getZ() {
        return z;
    }
	public void setVec3D(double x, double y, double z) {
		super.setVec(x, y);
		this.z = z;
	}
	public String toString() {
		return super.toString() + "z = " + z ;	
	}
	public boolean equals() {
		return  super.equals()&&  super.getX() == z;
	}
	public double norme() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }


}
