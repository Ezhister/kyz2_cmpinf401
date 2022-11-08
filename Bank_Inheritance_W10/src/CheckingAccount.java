import java.util.UUID;

import javax.swing.JOptionPane;

public final class CheckingAccount extends Account{
	private final double OVERDRAFT_PENALTY = 25;
	private final double MAX_WITHDRAWAL = 500; //Constant
	//Very first thing is create a constructor
	public CheckingAccount() {

		
		super(); 
	}  //calling constructor of parent class
	//	super.storeTransaction();  the method can be called from parent class, but HAS to be public
		//private components of a class are only accessible from that class, a subclass can't access them
	
		// @ means directive
		@Override
		public void withdraw(double amount) { //this OVERRIDES the parent class method
			if(amount <= MAX_WITHDRAWAL) {
				super.withdraw(amount); //calling withdraw method of parent class
			}
			else {
				JOptionPane.showMessageDialog(null, "You cannot withdraw more than 500$");
				
		//	this.balance -=amount;
		//	Transaction t= new Transaction("withdrawal",amount,this.accountNumber);
		}
		}
		
	//@Override
	//public String toString() {
	//	return "Hello, I'm a checking account"; //override toString method of object class, so when you print the account it doesn't print memory location
//	}	
	
	//you can daisy chain overrides, and now this also prints when you print out an account
	@Override
	public String toString() {
		String str = super.toString();
		str=str + "; This is a checking account";
		return str;
	}

	
	Account a = new CheckingAccount();
	//Account a = new Account(); can't be done because account is abstract
	}
