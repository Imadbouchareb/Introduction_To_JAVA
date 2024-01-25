package javaCollection;

import java.util.*;//import for accessing Array_list class

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();//create an array list for string type object 
		
		//Add items in the array list 
		cityList.add("Paris");
		cityList.add("Marseille");
		cityList.add("Mulhouse");
		cityList.add("Toulouse");
		cityList.add("Brest");
		
		System.out.println("The size of the array list :" + cityList.size());
		
		//Display the content of the array list 
		System.out.println("Cities : " + cityList);
		
		//Display the content of the array list one by one
		for(String city: cityList) {		
			System.out.println(city);
		}
		
		//insert another city at the index 2 in cityList
		cityList.add(2, "Nice");
		
		System.out.println("Cities : " + cityList);
		
		
	}

}
