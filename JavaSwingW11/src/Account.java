
public class Account {
	// this account used to create accounts for the combo box
private double balance;
private int accountID;
private String accountType;

public Account(double balance, int accountID, String accountType) {
	
	this.balance = balance;
	this.accountID = accountID;
	this.accountType = accountType;
}



public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getAccountID() {
	return accountID;
}
public void setAccountID(int accountID) {
	this.accountID = accountID;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}

@Override   //This makes it so when we print the accounts, it doesn't give us 
//their address but something meaningful
public String toString() {
	return "Account # " + this.accountID + ": " + this.balance;
}

}
