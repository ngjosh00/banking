
public class CheckingAccount extends Account{

	private double monthlyFee;
	
	public CheckingAccount(Client c, double balance, double monthlyFee) {
		super(c, balance);
		this.monthlyFee = monthlyFee;
	}
	
	public double getMonthlyFee() {
		return monthlyFee;
	}
	
	public boolean setMonthlyFee(double fee) {	
		return fee < 0.0 ? false : true;
	}
}
