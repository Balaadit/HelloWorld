package day1;

public class Test3 {
	
	interface HasTail { int getTailLength(); }
	abstract class Puma implements HasTail {
	protected int getTailLength() {return 4;}
	 }
	 public class Cougar extends Puma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	

	
	 Puma puma = new Puma();
	 System.out.println(puma.getTailLength());
	 }
	
	 public int getTailLength(int length) {return 2;}
	 }

	

}