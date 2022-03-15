package encapsulationPackage;

public class AccountBalance {

	private double balance;							// data hiding
	
	public void setBalance(double balance)			// setters
	{
		this.balance = this.balance + balance;
	}
	
	public double getBalance()
	{
		return balance;
		
	}
	
}
