import java.util.ArrayList;
import java.util.UUID;
//This is the a copy of the original bank lecture
//We use arrays
//Java tip, double click on a line to create a break point 
//Then run and use debug mode, break points only work with debug mode
//Step into does code one line at a time, and you can see how variables change
public class Driver_Bank {

	public static void main(String[] args) {
	/*	Account[] accountList = new Account[20]; //Currently elements are null
		
		for(int i = 0 ; i<accountList.length;i++) {
		//	System.out.println(accountList[i]); 
			accountList[i] = new Account("checking");  //We have made new accounts for each element
		}
		for (Account a : accountList) { // for each account in accountList  or  //(int i = 0 ; i<accountList.length;i++) {
			System.out.println(a.getAccountNumber()); 
	}
}*/
		
		Account a = new Account("checking");
		
		System.out.println("Checking owners logic");
		System.out.println("__________________________\n");
		
		for(int i = 0; i<5; i++) { //create bunch of owners with same name
			User u = new User("111-11-1111","Bob", "Smith");
			a.addOwner(u); //add owner
		}
	ArrayList<User> ownerList = a.getOwner(); //should return an arraylist
	for(User owner : ownerList) { //for each owner of type User
		System.out.println(owner.getUserID() + " - " + owner.getLastName());
	}
	System.out.println("__________________________\n");
	System.out.println("Checking transactions logic");
	System.out.println("__________________________\n");
	
	a.deposit(10000);
	System.out.println("Balance: " + a.getBalance());
	a.deposit(500);
	System.out.println("Balance: " + a.getBalance());
	a.withdraw(2000);
	System.out.println("Balance: " + a.getBalance()) ; // we now have 3 transactions
	
	System.out.println("Transactions: " + a.GetTransactions().size());
	
	//standard for loop
	for (int i=0; i<a.GetTransactions().size(); i++) { 
	//	System.out.println(a.GetTransactions().get(i).GetTransactionAmount()); //First makes a list of transactions, then gets one element and finds the amount in that element.
		
		
		
	}
	
	//Using enhanced for loop
	for (Transaction t: a.GetTransactions()) {  //for each element in the list, stores it in variable t
	//	System.out.println(t.getTransactionType() + ": " + t.GetTransactionAmount());
	}
}
	
}