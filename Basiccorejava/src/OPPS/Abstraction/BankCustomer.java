package OPPS.Abstraction;

public class BankCustomer {
 public static void main(String[] args)
 
 {
BankCustomer obj=new BankCustomer();

obj.createaccount("HDFC");
obj.createaccount("ICICI");
obj.createaccount("Vijaya");


		/*
		 * RBI acc; acc=new Vijaya(); acc.savingaccount(); acc.currentaccount();
		 * acc.CreditCard(); acc.DebitCard();
		 * 
		 * 
		 * acc=new HDFC(); acc.savingaccount(); acc.currentaccount(); acc.CreditCard();
		 * acc.DebitCard();
		 * 
		 * 
		 * acc=new ICICI(); acc.savingaccount(); acc.currentaccount(); acc.CreditCard();
		 * acc.DebitCard();
		 */ }
 public void createaccount(String BankName)
 {
	 RBI acc=null;
	 
	 if(BankName.equals("Vijaya"))
	 {	 
	 acc=new Vijaya();
 }
	
 else if(BankName.equals("ICICI"))
 {
	 acc=new ICICI();
	 
 }
 else if (BankName.equals("HDFC"))
 {
	 acc=new HDFC();
	 
 } 
 acc.savingaccount();
	 acc.currentaccount();
	 acc.CreditCard();
	 acc.DebitCard(); 
	 SupremeCourt.RTI();
	 acc.demonetization();
	 System.out.println("-------------");
	 
 }
}
