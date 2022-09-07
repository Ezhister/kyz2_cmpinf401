package edu.pitt.Assignment1;
import javax.swing.JOptionPane;
public class Lab2_Problem3 {

	public static void main(String[] args) {
		// Declare strings for input
		String money;
	
			//get input from users 
	money= JOptionPane.showInputDialog("User, please input a dollar amount from 1 to 9999!");
	//Convert to int
	int money_converted=Integer.parseInt(money);
//Get values of grands, Benjamins, sawbucks, and bucks
int grands = money_converted /1000;

int grands_mod = money_converted%1000;

int Benjamins = grands_mod / 100;

int Benjamins_mod= grands_mod%100;

int sawbucks = Benjamins_mod /10;

int sawbucks_mod=grands_mod % 10;

int bucks = sawbucks_mod / 1;

//Output 
JOptionPane.showMessageDialog(null, grands + " grands\n" + Benjamins + " Benjamins\n" + sawbucks + " sawbucks\n" + bucks +" bucks");

	}
}
