package day1;

public class for_loop {
  
	static void decorate()
	{
		System.out.println("-------------------------");
	}
	
	public static void main(String[] args) {
		
			
			
			for(int i=1;i<=10;i++)
			{
				decorate();
				System.out.println("Now we are in outer loop@@@@ iteration: "+ i);
				decorate();
				
				for(int j=1;j<=10;j++)
					{
					System.out.println("Now we are in Inner loop### iteration: "+ j);
					}
				
			}
			
		
		

	}

}
