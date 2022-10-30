import java.util.ArrayList;
import java.util.UUID;
//Note on adding a new element to an arraylist
//To add a new element at position 1 and move all elements with index 1 or larger by one position
// Do name.add(1,"_____");
import javax.swing.JOptionPane;
//you can generate java doc thru project
//The arraylist method allows us to do lines of code in one line of code
/**
 * This class manages individual bank accounts
 * @author Kyle Zhang
 *
 */

public class Account {
private String accountNumber;   //Sequential numbers for user IDs can crash systems
private String accountType;
private double balance;   //We use UUID it's a 32 character string for identification. 
private double interestRate;

//Each account may have up to two owners
private ArrayList<User> owners; //can make this after we make the class "User"

//Each account may have up to 10 transactions
private ArrayList<Transaction> transactions;  

/**
 * This constructor for Account class generates a new account ID and 
 * sets the account type based on the parameter provided by user
 * balance and interestRate parameters are initialized to zeros.
 * @param accountType: type of account (e.g., checking or savings)
 */

//owner:User need to create class of type User

//Getters and setters

public Account(String accountType) {

	this.accountNumber=	UUID.randomUUID().toString(); //Generates random UUID
	this.accountType=accountType;
	this.balance=0;
	this.interestRate=0;
	this.owners = new ArrayList< User>();//Array of type User 
	this.transactions = new ArrayList<Transaction>(); //Initialize an array of type Transaction w/ length 10
		//The array is called transactions
}

/**
 * This constructor for Account class generates a new account ID and 
 * sets the account type and interest rate based on the parameter provided by user
 * balance parameter is initialized to zero.
 * @param accountType: Type of account (e.g. checking or savings)
 * @param interestRate: Optional interest rate, by default set to 0
 */
public Account(String accountType, double interestRate) {  //for savings account it's overloaded

	this.accountNumber=	UUID.randomUUID().toString(); //Generates random UUID
	this.accountType=accountType;
	this.balance=0;  
	this.interestRate=interestRate;
	this.owners = new ArrayList<User>(); 
	this.transactions = new ArrayList<Transaction>(); //Initialize an array
}

public Account(String accountNumber, String accountType, double balance, double interestRate) {
	this.accountNumber = accountNumber;  
	this.accountType = accountType;
	this.balance = balance;
	this.interestRate = interestRate;
	this.owners = new ArrayList<User>(); 
	this.transactions = new ArrayList<Transaction>(); 
}
	/**
	 * Withdraws money from an account
	 * @param amount: Amount of money to be withdrawn from an account
	 */
	public void withdraw(double amount) {
		this.balance -=amount;
		Transaction t= new Transaction("withdrawal",amount,this.accountNumber);
		transactions.add(t); //how you add something to transaction array
	}
	
	/**
	 * Deposits money into an account
	 * @param amount: Amount of money to be deposited into an account
	 */
	public void deposit(double amount) {
		this.balance +=amount;
		Transaction t= new Transaction("deposit",amount,this.accountNumber);
		transactions.add(t); //Does what below code would have done, add transaction to an array
	}
	/*/**
	 * Saves a transaction to a list of transactions
	 * Note: pay attention to visibility of this method - declared private
	 * @param t a Transaction object
	 
	private void storeTransaction(Transaction t) {
		for (int i =0; i<this.transactions.length; i++) {
			//check each element of the array
			//If it s not null, add transaction to that position
			if(this.transactions[i] != null) {
				this.transactions[i] = t;
				break; //Once you added an transaction exit the loop
			}
		}
	}*/
	
	/** 
	 * Adds a new owner to an account. Multiple owners are allowed.
	 * @param owner an object of type User that denotes account owner
	 */
public void addOwner(User owner) {
	this.owners.add(owner);
}
/*  if(owners[0] == null) {
	  owners[0]=owner; //first user to get added to account is stored at index 0
  }
  else if(owners[1] == null) {
	  owners[1] = owner; // Second user to get added to account is stored at index 1
  }
  else {
	  JOptionPane.showMessageDialog(null,"This account already has two owners!");
  }
*/

	//Getters and setters, mostly getters


/**
 * Getter for interest rate
 * @return Interest rate for an account
 */
public double getInterestRate() {
	return interestRate;
}

/** 
 * Setter for interest rate
 * @param interestRate Interest rate for an account
 */
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

/**
 * Getter for account number
 * @return Account number of a given account
 */
public String getAccountNumber() {
	return accountNumber;
}

/**
 * Getter for account type
 * @return Account number of a given account
 */
public String getAccountType() {
	return accountType;
}

/**
 * Getter for account balance
 * @return Account balance
 */
public double getBalance() {
	return balance;
}

/**
 * Getter for account owner 
 * @return An object of type User that denotes account owner 
 */
public ArrayList<User> getOwner() {
	return this.owners;
}
public ArrayList<Transaction> GetTransactions() {
	return this.transactions;   //Get number of transactions
}
}
