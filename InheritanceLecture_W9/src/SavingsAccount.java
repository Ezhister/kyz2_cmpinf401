public class SavingsAccount extends Account{
	private String accountType;
	private final double PENALTY = 0.05;
	
	public SavingsAccount(double amount) {
		super(amount);
		accountType = "savings";
	}
	
	public SavingsAccount() {
		super();
		accountType = "savings";
	}
	
	@Override // used to check that overrides the withdraw in account. This is punishing someone for withdrawing from a savings account
	public void withdraw(double amount) {
		super.withdraw(amount);
		double penalty = super.getBalance() * PENALTY;
		super.withdraw(penalty);
	}
	
}
