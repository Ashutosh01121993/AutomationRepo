package Construtor;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1=new Car();
		
		car1.colour="Red";
		car1.model="Sedan";
		car1.type="Automatic";
		car1.specification();
		
Car car2=new Car();
		
		car2.colour="White";
		car2.model="SUV";
		car2.type="Automatic";
		car2.specification();
		
Car car3=new Car();
		
		car3.colour="Black";
		car3.model="Hatchback";
		car3.type="Automatic";
		car3.specification();
		
		Car car4=new Car("Sedan","Black","Manual");
		car4.specification();
	}

}

