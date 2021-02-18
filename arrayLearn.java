package day1;

public class arrayLearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray; //declare an array
		
		intArray = new int [10]; //Allocate memory
		
		//Initialize the array elements
		
		intArray [0] = 10;
		System.out.println ("Integer Array lenght is:"+ intArray.length);
		System.out.println ("Value of index-0 is : "+ intArray [0]);
		System.out.println ("Value of index-9 is : "+ intArray [9]);
		System.out.println ("   ====================    ");
		
		//array of arrays
		
		String [][] array1 ={{"I am ", "You are"},{"Good"," Bad","Better"}};
		
		System.out.println ("Multiple Array lenght is:"+ array1.length);
		System.out.println ("Multi Array test1 : "+ array1[0][0] + array1[1][0]);
		System.out.println ("Multi Array test2 : "+ array1[0][1] + array1[1][1]);
		System.out.println ("   ====================    ");
		
		//arraycopy test
		char[] charArray1={'a','h','a','i','u'};
		
		char[] charArray2= new char[3];
		
		
		System.arraycopy(charArray1, 1, charArray2, 0, 3);
		System.out.println(new String (charArray2));
		System.out.println ("   ====================    ");
		
		//example using arrayofrange
		
		char[] copyFrom ={'a','h','a','i','u'};
		
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 4);
		
		
		System.out.println(new String (copyTo));
		System.out.println ("   ====================    ");
		//array equals example
		
		int[] arraya ={1,2,3};
		//int[] arrayb ={1,2,3};
		
		int[] arrayc ={3,2,1};
		
		boolean equalTest= java.util.Arrays.equals(arraya, arrayc);
		
		 
		System.out.println("Array equal test: " +equalTest );
		System.out.println ("   ====================    ");
		
		
		//Sorting an Array
		
		
		java.util.Arrays.sort(arrayc);
		
		System.out.println("Example after sorting: array index-0 is =" +arrayc[0]+","+"array index-1 is ="+arrayc[1]);
		
	}

}
