package OPPS.Abstraction;

public class ICICI implements RBI{
	public void savingaccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Saving Account");
	}

	@Override
	public void currentaccount() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Current Account");
	}

	@Override
	public void CreditCard() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Credit Card");
	}

	@Override
	public void DebitCard() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Debit Card");
}
}
