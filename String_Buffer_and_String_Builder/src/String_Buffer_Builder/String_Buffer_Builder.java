package String_Buffer_Builder;

public class String_Buffer_Builder {
	public static void main(String[] args) {
		
		StringBuffer sBuffer = new StringBuffer();//default capacity is 16
		System.out.println("Capacity of sBuffer: " + sBuffer.capacity());
		
		sBuffer = new StringBuffer(50);//Set the capacity to 50
		System.out.println("Capacity of sBuffer: " + sBuffer.capacity());
		
		//String buffer capacity is now 16 + length of given string
		sBuffer = new StringBuffer("My StringBuffer");
		System.out.println("Capacity of sBuffer: " + sBuffer.capacity());
		
		System.out.println("String in sBuffer: " + sBuffer);
		
		//StringBuilders are used same as StringBuffer
		StringBuilder sBuilder = new StringBuilder("My StringBuilder");
		System.out.println("String in sBuffer: " + sBuffer);
		
		//append string after the string buffer and string builder
		sBuffer.append(". Appended with StringBuffer.");
		sBuilder.append(". Appended with StringBuilder.");
		System.out.println("String in sBuffer: " + sBuffer);
		System.out.println("String in sBuffer: " + sBuilder);
		
		sBuffer = new StringBuffer("AABCABBC");
		sBuilder = new StringBuilder("abaabcabac");
		
		//insert string between the old strings
		sBuffer.insert(5, "pqrst");//insert substring at index 5
		sBuilder.insert(3, "XYZ");//insert substring at index 3
		System.out.println("String in sBuffer: " + sBuffer);
		System.out.println("String in sBuffer: " + sBuilder);
		
		//reverse the strings
		System.out.println("Reversed StringBuffer: " + sBuffer.reverse());
		System.out.println("Reversed StringBuffer: " + sBuilder.reverse());
	}

}
