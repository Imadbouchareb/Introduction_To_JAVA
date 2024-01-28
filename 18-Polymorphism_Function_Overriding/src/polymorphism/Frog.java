package polymorphism;

public class Frog extends Animal{
	@Override
    public void movement() {//redefine the movement method
        System.out.println("Calling movement method of parent class");
        super.movement();//call the movement method of the parent class first
        //then print from current movement method
        System.out.println("Frogs can jump.\n");
    }
}
