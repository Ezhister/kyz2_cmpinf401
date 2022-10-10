import java.util.UUID;

public class Driver_Bank {

	public static void main(String[] args) {
		/* Methods deposit and withdraw. Money in account 
		 * Account
		 * accountNumber: String
		 * accountType: String
		 * balance: double
		 * interestRate:double
		 * owner: User    //property owner of data type User (User object)
		 * 
		 * User
		 * ssn: String
		 * dob: String
		 * firstName: String
		 * lastName: String
		 * userName: String
		 * password: String
		 * account: Account  //property account of data type Account (Account object)
		 * 
		 * Transaction
		 * transactionID: String
		 * transactionType: String
		 * amount: double
		 * originAccountNumber: String
		 * destinationAccountNumber: String
		 */
		User u1= new User("111-11-1111", "Dmitry","Babichenko");
		System.out.println(u1.getFirstName() + " " + u1.getLastName());
		
		
		User u2= new User("222-22-222", "Jane","Smith");
		System.out.println(u2.getFirstName() + " " + u2.getLastName());
		
		Account a= new Account ("checking");
	//	u.addAccount(a); //add new account to user
		
		a.addOwner(u1);  //set user to be account's owner
		a.addOwner(u2); //set user to be the account's co-owner
		
		System.out.println("Balance: " + a.getBalance());
		a.deposit(20);
		System.out.println("Balance: " + a.getBalance());
		a.deposit(1000);
		System.out.println("Balance: " + a.getBalance());
		a.deposit(200);
		System.out.println("Balance: " + a.getBalance());
		a.withdraw(200);
		System.out.println("Balance: " + a.getBalance());
	
		/*
		 * class hierarchy for Account and Owner as follows:
		 * 1. Account --> User
		 * 2. 
		 */
		// Step 1: Get list of owners
		User[] userList = a.getOwner(); //Get a list of owners from account
		System.out.println(userList[0]); 
		System.out.println(userList[1]); 
		
		//Step 2: Get individual owner objects (User objects)
		User owner1= userList[0];
		User owner2=userList[1];
		System.out.println("Owner 1: " + owner1.getFirstName() + " " + owner1.getLastName());
		System.out.println("Owner 2: " + owner2.getFirstName() + " " + owner2.getLastName());
		
		//You can do all of this by daisy chaining things
		
		for(int i = 0; i<a.getOwner().length; i++ ) {  //Daisy chain
			System.out.println(a.getOwner()[i].getFirstName()); //getOwner gets list of owners with index i. and we do the next step after.
		}
		
		/*
		//User accountOwner = a.getOwner();       object of type User
		//accountOwner.getUserID();             //Performing a method on he object accountOwner. We skip over it with daisy chain	
		System.out.println("Owner ID: + " a.getOwner().getUserID()); //daisy chain
		//Returns an object of type User for a.getOwner and get User ID is a method of User
		//account and user are linked
		
		System.out.println("Balance: " + a.getBalance());;
		a.deposit(20);
		System.out.println("Balance: " + a.getBalance());;
		a.deposit(1000);
		System.out.println("Balance: " + a.getBalance());;
		a.deposit(200);
		System.out.println("Balance: " + a.getBalance());;
		a.withdraw(200);
		System.out.println("Balance: " + a.getBalance());;
	
		*/

		//What is the NullPointerException Error???
		//Trying to access an object that has not been initialized
	}

}
