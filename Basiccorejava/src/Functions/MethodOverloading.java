package Functions;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading obj=new MethodOverloading();
obj.sum(10,20,40);

	}
public void sum(int a , int b)
{
	System.out.println(a+b);
	
}

public void sum(int a ,int b, int c)
{
	System.out.println(a+b+c);
	
}
}


