package program.jav.acessmodifier;

class TestA {

	private int y= 10;
	
	long k = 1000;
	
	public void methodPublic(){
		methodPrivate();
	}
	
	protected void methodProtected(){
		methodPrivate();
	}
	
	void methodDefault(){
		methodPrivate();
	}
	
	private void methodPrivate(){
		System.out.println("Class TestA: methodProtected");
		System.out.println("Value of private valye y"+ y);
		System.out.println("Value of long"+ k);
	}
}
