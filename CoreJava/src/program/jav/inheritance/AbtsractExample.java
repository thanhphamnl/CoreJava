package program.jav.inheritance;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  
	 Bike()
	 {
		 System.out.println("bike is created");
	 }  
	 
	 abstract void run();  // abstarct method()
	 
	 void changeGear()   //non-abstract method
	 {
		 System.out.println("gear changed");
	 }  
}  
	
//Creating a Child class which inherits Abstract class  
	abstract class Honda extends Bike{  
		
	abstract void run();
	/*void run()
	{
		System.out.println("running safely..");
	}  */
}  
	class Hello extends Honda
	{
		void run()
		{
			System.out.println("running safely..");
		} 
	}
	
//Creating a Test class which calls abstract and non-abstract methods  
public class AbtsractExample{  
	public static void main(String args[]){  
	
	Bike obj = new Hello(); //?  
	Hello k = new Hello(); 
	obj.run();  
	obj.changeGear();  
  }  
}  
