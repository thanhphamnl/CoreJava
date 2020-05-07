package program.jav.basic;

public class TypecastExample {
	
	public static void main(String[] args) 
    { 
        int i = 100;        
        // automatic type conversion 
        long l = i;  
        
        double d= 190.00;
        float r= (float) d;
        System.out.println("double value "+r); 
        
        // automatic type conversion 
        float f = l;  
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
    } 

}
