package inheritance3_hierarchical_Inheritance;

public class A4_BankMain {

	public static void main(String[] args) {
		
		A2_BankBalanceCheck bank = new A2_BankBalanceCheck();
		bank.loginButton();
		bank.mPassbook();
		bank.password();
		bank.statement();
		bank.username();
		
	
		A3_BankFundTransfer bank1 = new A3_BankFundTransfer();
		bank1.imps();
		bank1.neft();
		bank1.quickTransfer();
		

	}

}
