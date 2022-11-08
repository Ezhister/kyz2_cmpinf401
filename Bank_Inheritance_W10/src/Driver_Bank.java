import java.util.ArrayList;
import java.util.UUID;

public class Driver_Bank {

	public static void main(String[] args) {
		
		/*
		CheckingAccount ca = new CheckingAccount();
		ca.deposit(1000);
		System.out.println(ca.getBalance()); //the subclass inherits get balance (public method) 
		ca.withdraw(300);
		System.out.println(ca.getBalance());
		System.out.println(ca); //this gives us location of ca
		
		SavingsAccount sa = new SavingsAccount();
		System.out.println(sa);
		*/
		
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		
		//System.out.println(a instanceof CheckingAccount); //checks what type of class is a 
		accounts.add(new CheckingAccount());
		accounts.add(new CheckingAccount());
		accounts.add(new CheckingAccount());
		accounts.add(new CheckingAccount());
		accounts.add(new SavingsAccount());
		accounts.add(new SavingsAccount());
		accounts.add(new SavingsAccount());
		accounts.add(new SavingsAccount());
		
		for (Account a : accounts) {
			System.out.print(a); //prints account and balance instead of location
			if(a instanceof CheckingAccount) {
				System.out.println("Account type: checking");
			}
			else if(a instanceof SavingsAccount) {
				System.out.println("Account type: savings");
			}
			else {
				System.out.println("; Account type: unknown");
			}
		}
		Account a = new CheckingAccount(); //you can store a more specifc instance in a more general instance
	}

}
