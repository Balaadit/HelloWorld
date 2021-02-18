package day1;

public class checkSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accessMethods AM = new accessMethods();
		
	//	AM.firstname = "Bala1";
		AM.lastname= "Adithan";
		AM.middlename = "  ";
		
		AM.setfirstname("Balaganesan");
		//AM.middlename(" ");
		AM.getfirstlastname();
		
		AM.getdetails();
	}

}
