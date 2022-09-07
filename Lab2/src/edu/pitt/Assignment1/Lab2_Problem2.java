package edu.pitt.Assignment1;
import javax.swing.JOptionPane;
public class Lab2_Problem2 {

	public static void main(String[] args) {
		// Declare strings for input
		String r;
	
			//get input from users 
	r= JOptionPane.showInputDialog("User, please input a number!");
	//Convert to double
	double r_converted=Double.parseDouble(r);
//Compute perimeter
	double perimenter = 2*Math.PI*r_converted;
	
	
//Compute Area
	double area= Math.PI*r_converted*r_converted;
	//Show area and perimenter, concatenating strings and doubles
	JOptionPane.showMessageDialog(null, "The circle with radius "+ r_converted +" has an area of "+ area+ "and a perimeter of " + perimenter);	
		
		//To make decimals only 2 refer to trick in PythagoreanTheorem
		
	}

}
