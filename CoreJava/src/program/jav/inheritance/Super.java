package program.jav.inheritance;

class Person
{
	String name;
	
	Person(String name){ // constuctor of prson
	this.name=name;
     }
	
	Person()
	{
		System.out.println("i am inside the Person default consturctor");
	}
}

class Emp extends Person{
	float salary;
	
	Emp(String name,float salary){
	super(name); //reusing parent constructor
	this.salary=salary;
	}
	
	Emp()
	{
		super();
	}
	
	void display()
	{System.out.println(name+" "+salary);}
	}

class Super{
public static void main(String[] args){
	Emp e = new Emp();
Emp e1=new Emp("Vikram",45000f);
e1.display();
}} 
