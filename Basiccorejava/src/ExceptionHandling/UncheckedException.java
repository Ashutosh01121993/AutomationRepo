package ExceptionHandling;

import OPPS.Abstraction.ICICI;

public class UncheckedException {

	static ICICI Bank;
	public static void main(String[] args)
	
	{
		
		//Example airthmatic Exception
		 System.out.println(10/1); 
		
		//Example2 java.lang.ArrayIndexOutOfBoundsException:
		
		String[] arr=new String[2];
		arr[0]="Anand";
		arr[1]="Ashutosh";
		/* arr[2]="asfa"; */
		/*
		 * for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
		
		 */
		
		//Example3:NullPointerException
		Bank.CreditCard();
		
		
	}
	
}

