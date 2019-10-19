package ExceptionHandling;

import OPPS.Abstraction.ICICI;

public class Exceptionhandling1 {

		// TODO Auto-generated method stub
		static ICICI Bank;
		public static void main(String[] args)

		{
			
			try
			
			{
				
				//Example airthmatic Exception
				 System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				
				System.out.println(e.getMessage());
			}
			
			 
			try {
			//Example2 java.lang.ArrayIndexOutOfBoundsException:
			
			String[] arr=new String[2];
			arr[0]="Anand";
			arr[1]="Ashutosh";
			/* arr[2]="asfa"; */
			/*
			 * for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
			
			 */
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
				
			}
			
			try {
			//Example3:NullPointerException
			Bank.CreditCard();
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
				
			}
	}

}
