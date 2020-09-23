import java.util.*;
public class Bank {

	private static HashMap<Long, Account> account_database;
	public static final int ROUTING_NUMBER = 834587433;
	
	private String bankName;
	
	public Bank(String name) {
		this.bankName = name;
		this.account_database = new HashMap<>();
	}
	
	public void addAccount(Account a) {
		account_database.put(a.getAccountNumber(), a);
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String name) {
		this.bankName = name;
	}
	
	public Account getAccount(long accountNumber) {
		return account_database.get(accountNumber);
	}
}