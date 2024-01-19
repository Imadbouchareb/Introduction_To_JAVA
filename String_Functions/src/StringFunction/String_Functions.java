package StringFunction;

public class String_Functions {
	public static void main(String[] args) {
		String str1 = "HELLO", str2 = "hello";
		
		//length function to get number of characters in the string
		System.out.println("The length of the string : " + str1 + " is: " + str1.length());
		
		//equal method to check both strings are same of not (case sensitive)
		if(str1.equals(str2))
			System.out.println(str1 + " & " + str2 + " are same.");
		else
			System.out.println(str1 + " & " + str2 + " are not same.");
		
		//equal method to check both strings are same of not (case insensitive)
				if(str1.equalsIgnoreCase(str2))
					System.out.println(str1 + " & " + str2 + " are same.");
				else
					System.out.println(str1 + " & " + str2 + " are not same.");
		
		//find the character at the given index
		System.out.println("The character at position 2 is : " + str1.charAt(2));
		
		//compare the first string with second, it returns distance of first mismatched characters
		System.out.println("Comparing " + str1 + " & " + str2 + " Distance : " + str1.compareTo(str2));
		
		str1 = "AABBCABBAA";
		str2 = "JAVA String Funtions";
		
		//check whether the string is starts with or ends with given substring or not
		System.out.println("The string  " + str1 + "is starts with (AAB) : " + str1.startsWith("AAB"));
		System.out.println("The string  " + str1 + "is starts with (ACA) : " + str1.endsWith("ACA"));
		
		//find the location of first and last occurence of a substring
		System.out.println("First index of (BB) in " + str1 + " is: " + str1.indexOf("BB"));
		System.out.println("Last index of (BB) in " + str1 + " is: " + str1.lastIndexOf("BB"));
		
		//replacing a substring with new substring
		System.out.println("Replacing (ABB) to (xy) of " + str1 + " is: " + str1.replace("ABB", "xy"));
		
		//get substring from a given string
		System.out.println("Substring of " + str2 + " from 5 to 15: " + str2.substring(5, 11));
		
		//split the string by using (-) as delimiter
		str1 = "This-is-a-test-string";
		String[] splitArr = str1.split("-");
		
		System.out.println("The splitted parts are: ");
		for(String sp : splitArr) //for each element of splitted
			System.out.println(sp);
		
		//trim the blank spaces from starting and ending of the string
		str2 ="        Lot's of spaces      ";
		System.out.println("Before Trimming:  (" + str2 + ")" );
		System.out.println("After Trimming:  (" + str2.trim() + ")" );
		
		
	}

}
