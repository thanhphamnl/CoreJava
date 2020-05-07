package program.jav.basic;

public class WrapperExample {

	public static void main(String[] args) {
		  final long i=9L;
		  
		  
		  
		 
		 int ff= (int)i;  // explicit casting
		 Integer f1= ff;
		 
		 int g = Integer.valueOf(f1);
		 
		 System.out.println("ff  "+ ff);
		 
		 String yy= new String("Hello");  // 2 objects are there :) // string pool + Obejct POOL
		 String rr= "hello"; // String pool
		
		 //enhanced for loop
		 int[] arr = {5,6,8,9,10,56,88,99};
		 for(int f:arr)
		 {
			 System.out.println("f:  "+ f);
		 }

	}

}
