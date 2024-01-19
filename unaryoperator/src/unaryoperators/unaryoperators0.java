package unaryoperators;

public class unaryoperators0 {
	public static void main(String[] args) {
		int var1, var2;
		var1 = 50;
		
		var2 = -var1;
		System.out.println("The var1 = " + var1 + ", var2= " +var2);
		
		var1 = 50;
		var2 = var1++;
		System.out.println("The var1 = " + var1 + ", var2= " +var2);
		
		var1 = 50;
		var2= ++var1;
		System.out.println("The var1 = " + var1 + ", var2= " +var2);
		
		var1= 50;
		var2= var1--;
		System.out.println("The var1 = " + var1 + ", var2= " +var2);
		
		var1= 50;
		var2= --var1;
		System.out.println("The var1 = " + var1 + ", var2= " +var2);
		
		boolean bool1, res;
		bool1=true;
		
		res = !bool1;
		System.out.println("The boll1 is : " +bool1);
		System.out.println("The res is : " +res);
	
		
	}

}
