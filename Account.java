import java.util.*;

public class Account {

	private Client owner;
	private long accountNumber;
	private double balance;
	private HashSet<Account> transferHistory; //Holds a set of which accounts that you transferred to

	public Account(Client owner, double balance) {
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = generateAccountNumber();
		transferHistory = new HashSet<>();
	}

	public Client getOwner() {
		return this.owner;
	}

	public void setOwner(Client c) {
		this.owner = c;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean deposit(double amt) {

		if (amt < 0) {
			return false;
		}
		balance += amt;
		return true;
	}

	public double withdraw(double amt) {

		if (amt >= 0 && balance - amt >= 0) {
			balance -= amt;
			return amt;
		} else {
			return 0;
		}
	}

	public boolean transfer(Account otherAccount, double amt) {
		double transferAmt = this.withdraw(amt);
		boolean transferred = otherAccount.deposit(transferAmt);
		if(transferred) {
			transferHistory.add(otherAccount);
		}
		return transferred;
	}

	private long generateAccountNumber() {
		Random r = new Random();
		return Math.abs(r.nextLong());
	}
	
	@Override
	public String toString() {
		return owner.toString() +
				"Account Number: " + accountNumber + "\n" +
				"Account Balance: " + balance + "\n"; 
	}
}
