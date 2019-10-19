package ExceptionHandling;

import OPPS.Abstraction.ICICI;

public class MultipleCatchBlock {

	
		static ICICI Bank;
		public static void main(String[] args)
		{
		try{
			
			//Example airthmatic Exception
			 System.out.println(10/1); 
			
			//Example2 java.lang.ArrayIndexOutOfBoundsException:
			
			String[] arr=new String[2];
			arr[0]="Anand";
			arr[1]="Ashutosh";
			 arr[2]="asfa"; 
			/*
			 * for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
			
			 */
			
			//Example3:NullPointerException
			Bank.CreditCard();
		}
			catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
	} finally {
		
		System.out.println("Test Case Completed");
		System.out.println("Database Connection closed");
		System.out.println("Report Ending");
		System.out.println("Object flush");
	}

}}
