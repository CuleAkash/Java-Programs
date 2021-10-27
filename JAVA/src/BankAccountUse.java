
public class BankAccountUse {

	public static void main(String[] args) {
		BankAccount ac= new BankAccount("Mahenoor", 1500000, "Savings", 5000);
		ac.displayInfo();
		ac.makeDeposit(200);
		ac.displayInfo();
		ac.withdraw(500);
		ac.displayInfo();

	}

}
