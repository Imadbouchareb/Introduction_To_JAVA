package polymorphism;

public class OverrideMethode {
	public static void main(String[] args){
        Animal animal = new Animal(); //set animal as object Animal class
        animal.movement();

        //set animal reference variable to point Dog object
        animal = new Dog();
        animal.movement();

        //set animal reference variable to point Frog object
        animal = new Frog();
        animal.movement();
    }

}

