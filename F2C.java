package day1;
import java.util.Scanner;
public class F2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double tcelsius, tfaren;
		System.out.println("Enter the temperature in Fahrenhiet");
		tfaren = input.nextDouble();
		System.out.println("The temperature you have entered "+tfaren+ "F in Celsius is:"+ f2temp(tfaren)+"C.");
       
	}
	
	static double f2temp(double temp) { 
		double celsius;
	//return celsius = (temp - 32.0) * (5.0/9.0) ;
	return celsius = (temp - 32.0) * (1/1.8000) ;
	}
}
