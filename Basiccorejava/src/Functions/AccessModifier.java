package Functions;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AccessModifier obj= new AccessModifier();
obj.publicFunction();
obj.privateFunction();
obj.protectedFunction();
obj.noaccessspecifierFunction();
	}

	public void publicFunction()
	{
		System.out.println("this is Public Function");
	}
	
	public void privateFunction()
	{
		System.out.println("this is Private Function");
	}
	public void protectedFunction()
	{
		System.out.println("this is Protected Function");
	}
	public void noaccessspecifierFunction()
	{
		System.out.println("this is No Access Specifier Function");
	}
	
}
