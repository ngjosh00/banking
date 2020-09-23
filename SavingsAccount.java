
public class SavingsAccount extends Account{

	private double interestRate;
	
	public SavingsAccount(Client c, double balance, double interestRate) {
		super(c, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
