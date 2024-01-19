package bitwiseoperators;

public class bitwiseoperator0 {
	public static void main(String[] args) {
		byte var1 = 12;    // 0000 1100
		byte var2 = 10;    // 0000 1010
		byte res;
		 
		// 12 = 8 + 4 = 0000 1100 => 1111 0011 => - (0000 1100 + 1)= -(12+1)= -13
		res = (byte) ~var1;  //bitwise complement val1
		System.out.println("The result: " +res);
		
		res = (byte) (var1 & var2);
		System.out.println("The result: " +res);
		
		res = (byte) (var1 | var2);
		System.out.println("The result: " +res);
		
		res = (byte) (var1 ^ var2);   //bitwise XOR operation
		System.out.println("The result: " +res);
		
		res = (byte) (var1 << 2);  //Shift 2 bits to the left
		System.out.println("The result: " +res);
		
		res = (byte) (var1 >> 2); //Shift 2 bits to the right  
		System.out.println("The result: " +res);
	}

}
