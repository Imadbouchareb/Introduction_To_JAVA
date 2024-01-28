package vectors;

import java.util.Vector;


public class VectorsDemo {
	public static void main(String[] args) {
        Vector<Integer> numVector = new Vector<>(); //create a vector for Integer type object

        //Add items in the vector
        numVector.add(10);
        numVector.add(20);
        numVector.add(30);
        numVector.add(40);
        numVector.add(50);

        System.out.println("The size of the vector: " + numVector.size());

        //display the content of the vector 
        System.out.println("Numbers: " + numVector);

        //display the content of the vector one by one 
        for(Integer num: numVector){
            System.out.println(num);
        }

        //insert another number at the index 3 in numVector
        numVector.add(3, 100);

        System.out.println("Numbers: " + numVector);
    }
}


