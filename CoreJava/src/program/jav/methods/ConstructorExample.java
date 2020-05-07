package program.jav.methods;

public class ConstructorExample{  
	int id;   // class variables
	String name;  
	
	
	public ConstructorExample()  // default constructor
	{
		System.out.println("i m inside the default constructo");
	}
	
	//method to display the value of id and name  
	void display()
	{
		int y=0; // local variables
		System.out.println(id+" "+name);
	}  
	  
public static void main(String args[]){  
	//creating objects  
	ConstructorExample s1;  //Instance variables
	s1 =new ConstructorExample();
	
	ConstructorExample s2=new ConstructorExample();  
	
	//displaying values of the object  
	s1.display();  
	s2.display();  
    }  
}  