package Functions;

public class NonStaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticFunction obj=new NonStaticFunction();//object
	
		
		System.out.println(obj.sum(10,20));
		Functions1.sum(10,20);
		System.out.println(Functions1.sum(10,20));
	}

	public int sum(int a , int b)
	{
		return a+b;
		
	}
}
