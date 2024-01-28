package polymorphism;

public class Dog extends Animal{
	@Override
    public void movement() {//redefine the movement method for the Dog class
        System.out.println("Dogs can walk and run also.\n");
    }
}
