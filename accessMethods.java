package day1;

public class accessMethods {
	
	String firstname;
	String middlename;
	String lastname;
	
	
	public void Name (String firstname, String middlename,String lastname)
	{
				
		//this.firstname = firstname;
		//String m= middlename;
		//String l= lastname;
		
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
			
		
	}
	
	 void getdetails()
	{
		System.out.println("FirstName is :"+ firstname);
		System.out.println("MiddleNamme is :"+ middlename);
		System.out.println("LastName is:"+ lastname);
		
		
	}

	 
	 void setfirstname(String firstname)
	 
	 {
		 this.firstname = firstname;
		 
	 }
	 
	 
	 void getfirstlastname()
	 
	 {
		 
		 System.out.println("FirstName and Lastname is :"+ firstname +""+lastname);
		 
		 
	 }
	 
	 	 
	 
	 
}
