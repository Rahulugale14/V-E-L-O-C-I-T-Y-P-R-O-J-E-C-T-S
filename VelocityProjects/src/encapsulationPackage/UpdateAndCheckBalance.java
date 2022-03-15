package encapsulationPackage;

public class UpdateAndCheckBalance {

	public static void main(String[] args) {
		
		AccountBalance a = new AccountBalance();
		System.out.println(a.getBalance());
		
		a.setBalance(500.50);
		System.out.println(a.getBalance());
		
		a.setBalance(1500.50);
		System.out.println(a.getBalance());
	}

}
