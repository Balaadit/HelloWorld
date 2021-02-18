package day1;

public class ChildClass extends SuperClass {

	//ChildClass c = new ChildClass();
	
//	public void car()
//	{
//		System.out.println("This is from Child class");
//	}
	
	
	public static void main (String args[])
	
	{
		//ChildClass c = new ChildClass();
		SuperClass d = new ChildClass();
		
		//c.car();
		
		//c.vechile();
		d.vechile();
		//c.something();
		d.something();
		
	//d.nothing();
	}

	@Override
	void something() {
		System.out.println("Hi this is from ChildClass!!!");
		
	}
	
	void nothing(){
		System.out.println("This is to verify that nothing cant be called using Superclass as type!!!");
	}
	
}
