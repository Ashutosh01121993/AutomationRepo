package OOPS.Inharitance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhone phone=new SmartPhone();
phone.internet();
phone.calling();
phone.Texting();

Telephone phone2=new Telephone();

phone2.calling();
phone2=new Mobile();
phone2.calling();

	}

}
