package edu.pitt.Assignment1;
import javax.swing.JOptionPane;
public class Lab2_Problem1 {

	public static void main(String[] args) {
		// Declare strings for input
	String first_number;
	String second_number;
		//get input from users
first_number= JOptionPane.showInputDialog("User, please input a number!");
second_number=JOptionPane.showInputDialog("User, please input a second number!");
//Define all sides of the triangle and convert to double
double side_1=Double.parseDouble(second_number);
double side_2=Double.parseDouble(first_number);
double hypotenuse;

//Get squares of sides
double square_1=Math.pow(side_1, 2);
double square_2=Math.pow(side_2, 2);
//Add and sqrt
double combine = square_1+square_2;
hypotenuse=Math.sqrt(combine);
//Show result and make the decimals only 2
hypotenuse=hypotenuse*100;
int r= (int)Math.round(hypotenuse);
hypotenuse=r/100.0;
JOptionPane.showMessageDialog(null, hypotenuse);




	}

}
