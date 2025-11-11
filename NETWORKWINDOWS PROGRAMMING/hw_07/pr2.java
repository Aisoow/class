public class pr2 {
	public static void main(String[] args) {
		InvestingAccount ia = new InvestingAccount("1234", 100000, 0.08, 10);
		ia.calInterest();
		ia.total_return();
	}
}

abstract class Account {
	protected final String accountid;
	protected double balance;
	protected double rate;
	protected double interest;

	Account(String accountid, double balance, double rate) {
		this.accountid = accountid;
		this.balance = balance;
		this.rate = rate;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void calInterest();
}

class SavingAccount extends Account {
	private final boolean haveCard;

	SavingAccount(String accountid, double balance, double rate, boolean haveCard) {
		super(accountid, balance, rate);
		this.haveCard = haveCard;
	}

	public boolean hasCard() {
		return haveCard;
	}

	@Override
	public void calInterest() {
		interest = balance * rate;
		System.out.printf("interest=%.2f%n", interest);
	}
}

class InvestingAccount extends Account {
	private final int investYear;

	InvestingAccount(String accountid, double balance, double rate, int investYear) {
		super(accountid, balance, rate);
		this.investYear = investYear;
	}

	@Override
	public void calInterest() {
		double total = balance * Math.pow(1 + rate, investYear);
		interest = total - balance;
		System.out.printf("interest=%.2f%n", interest);
	}

	public void total_return() {
		double total = balance + interest;
		System.out.printf("total=%.2f%n", total);
	}
}
