package Oops;

public class TestFinalMethod {
	
	
	final public void cat() {
		
		System.out.println("Mewwoo");
	}

	
	
	
}

class Test2 extends TestFinalMethod{

	//@Override
	public void dog() {
		// TODO Auto-generated method stub
		super.cat();
	}
	
	
	
	
}
