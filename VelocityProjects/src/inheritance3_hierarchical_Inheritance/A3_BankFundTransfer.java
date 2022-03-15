package inheritance3_hierarchical_Inheritance;

public class A3_BankFundTransfer extends A1_BankLogin {

	public void imps()
	{
		System.out.println("Payment through RTGS");
	}
	
	public void neft()
	{
		System.out.println("Payment through NEFT");
	}
	
	public void quickTransfer()
	{
		System.out.println("Payment through Quick Transfer");
	}
	
}
