package ExceptionHandling;

public class ThrowAndThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("step 1");

 pause(-3000);
 

System.out.println("step 2");
	}

	public static void pause(long miliSeconds) throws InterruptedException
	{

		if(miliSeconds>=0)
			
		{
			
			Thread.sleep(miliSeconds);
			
	
		
	}
	else {
		
			
		
		throw new InterruptedException("Please enter positive value"); 
	}
		
	}
	
	
	public static void throwException(String message) throws Exception
	{
		
		throw new Exception(message);
		
		
	}
	
}
