package overloading;

public class FuncOverload {
	public static void area(float side) {//function to get area of a square
        System.out.println("Area of a square: " + (side * side));
    }

    public static void area(double radius) {//function to get area of a circle
        System.out.println("Area of a circle : " + (3.1415 * radius * radius));
    }

    public static void area(float l, float b) {//function to get area of a rectangle
        System.out.println("Area of a rectangle: " + (l * b));
    }

    public static void main(String[] args) {
        area(4F,5F);//overloaded area method to find area of rectangle
        area(5F);//overloaded area method to find area of square
        area(6D);//overloaded area method to find area of circle
    }

}
