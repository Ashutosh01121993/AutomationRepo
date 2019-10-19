package OOPS.Encapusulation;

public class Testing {

	private int age;
	public void test()
	{
		System.out.println("Pratikawa age is="+age);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age>0)
		this.age = age;
	}
}
