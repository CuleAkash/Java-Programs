
public class BankAccount {
	String name;
	long AccountNumber;
	String type;
	long balance;
	
	public BankAccount(String n, long a, String t, long b) {
		name= n;
		AccountNumber=a;
		type=t;
		balance=b;
	}
	
	public void makeDeposit(long deposit) {
		if(deposit>=0) {
			balance+= deposit;
		}
	}
	
	public boolean withdraw(long withdrawal) {
		if(withdrawal<= balance) {
			balance-=withdrawal;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void displayInfo() {
		System.out.println("Name of the Account Holder is: "+ name +  " Bank Balance is: "+ balance);
	}
}
