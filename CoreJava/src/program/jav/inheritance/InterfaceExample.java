package program.jav.inheritance;

//Interface declaration: by first user  
interface Drawable{  
	void draw();  //by default abstarct method()
}  

interface Shape{
	void shape();
}

interface Hello1 extends Drawable, Shape{
	void hello();
}

//Implementation: by second user  
class Rectangle implements Hello1{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
	
	public void hello(){
		System.out.println("drawing hello");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		
	}
}  
	
class Circle implements Drawable{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
}  
	
//Using interface: by third user  
public class InterfaceExample{  
	public static void main(String args[]){  
	
	Drawable d=new Circle();         //In real scenario, object is provided by method e.g. getDrawable()  
	Hello1 p = new Rectangle();
	d.draw();  
    }
}  