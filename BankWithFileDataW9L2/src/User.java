import java.util.ArrayList;
import java.util.UUID;
/**
 * This class manages individual bank users / account owners
 * @author Kyle Zhang
 *
 */
public class User {

	private String userID; 
	private String ssn;
//	private String userName; we will learn this later
//	private String password;
	private String firstName;
	private String lastName;
	private ArrayList< Account> accounts;    
	
	//Constructor
	/** 
	 * This constructor creates a new user based on user-provided parameters
	 * social security number, first name, and last name 
	 * @param ssn User's social security number
	 * @param firstName first name
	 * @param lastName last name
	 */
	public User(String ssn, String firstName, String lastName) {
		this.userID=UUID.randomUUID().toString(); //generates uuid
		this.ssn=ssn;
		this.firstName=firstName;
		this.lastName=lastName;
		this.accounts = new ArrayList<Account>(); //Users can own up to 5 accounts
	}
	public User(String userID, String ssn, String firstName, String lastName) {
		this.userID = userID;
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new ArrayList<Account>();
	}
/**
 * Getter for users first name
 * @return user's first name
 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * Setter for user's first name
	 * @param firstName User's first name
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter for user's last name
	 * @return User's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter for user's last name
	 * @param lastName User's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getter for User ID
	 * @return User's unique identifier (user ID)
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * Getter for user's social security number
	 * @return user's social security number
	 */
	public String getSsn() {
		return ssn;
	}
	
	/**
	 * Associate an account with user
	 * @param account an object of type Account, associates an account with a user
	 */
	public void addAccount(Account account) {
		this.accounts.add(account);
	/*	for( int i =0; i<this.accounts.length; i++ ) {
			//check each element of the array
			//If it is not null, add account to that position
			if(this.accounts[i] != null) {
				this.accounts[i] = account;
				break; //once you added an account, exit the loop
			}
	}*/
	}
	
	/**
	 * Getter for account list. Returns a list of accounts owner by user
	 * @return An array of accounts owned by user
	 */
	public ArrayList<Account> getAccounts() {
		return this.accounts;
		
	}
}
