//import 
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Lab5 {

	public static void main(String[] args) {
		//Create do while loop so code runs once and you can repeat the process again
		String phrase= ""; //has to be outside code to start
		
		do {
			
			
		
		String Rolls;
		//Gives the rolls in string, convert to int
		Rolls= JOptionPane.showInputDialog("User, please input the number of rolls desired!");
		int Rolls_converted=Integer.parseInt(Rolls);
		Random random= new Random();   //normally the random class is in a different file, but we are calling it from Java
		//Use RollDice function
		RollDice(random, Rolls_converted);
		
		phrase = JOptionPane.showInputDialog("Please enter 'yes' to roll again");
	}while(phrase.equalsIgnoreCase("yes"));
	}
	
	
		
		public static void RollDice(Random random, int Rolls) {
			//Define int parameters random 
			int n =Rolls;
			
			
			//Define values to count number of instances of 2-12
			double a=0;
			double b=0;
			double c=0;
			double d=0;
			double e=0;
			double f=0;
			double g=0;
			double h=0;
			double i=0;
			double j=0;
			double k=0;
			
			
		
			//Generate 100 ints between 1 and 6
			//Because the random.nextInt() is exclusive (if you put in 6 it goes from 0 to 5)
			for (int z=1; z<=n; z++) {
				int value = random.nextInt(6)  + 1  ;  //The next int generates values between 0 and a bound, so add 1. 
				int value2=random.nextInt(6)  + 1;    //random.nextInt() is similar to how in class you would do t.click()
				
				int sum = value + value2;
				if (sum==2) {
					a++;
				}
				else if (sum==3) {
					b++;
					
				}
				else if (sum==4) {
					c++;
					
				}
				else if (sum==5) {
					d++;
					
				}
				else if (sum==6) {
					e++;
					
				}
				else if (sum==7) {
					f++;
					
				}
				else if (sum==8) {
					g++;
					
				}
				else if (sum==9) {
					h++;
					
				}
				else if (sum==10) {
					i++;
					
				}
				else if (sum==11) {
					j++;
					
				}
				else if (sum==12) {
					k++;
					
				}
			}
			
			
			//Print out how many times each number shows up and the fraction out of all the rolls
			System.out.println("2 appears " + a + " number of times and " +a/Rolls+ " is the fraction of all the rolls");
			System.out.println("3 appears " + b + " number of times and " +b/Rolls+ " is the fraction of all the rolls");
			System.out.println("4 appears " + c + " number of times and " +c/Rolls+ " is the fraction of all the rolls");
			System.out.println("5 appears " + d + " number of times and " +d/Rolls+ " is the fraction of all the rolls");
			System.out.println("6 appears " + e + " number of times and " +e/Rolls+ " is the fraction of all the rolls");
			System.out.println("7 appears " + f + " number of times and " +f/Rolls+ " is the fraction of all the rolls");
			System.out.println("8 appears " + g + " number of times and " +g/Rolls+ " is the fraction of all the rolls");
			System.out.println("9 appears " + h + " number of times and " +h/Rolls+ " is the fraction of all the rolls");
			System.out.println("10 appears " + i + " number of times and " +i/Rolls+ " is the fraction of all the rolls");
			System.out.println("11 appears " + j + " number of times and " +j/Rolls+ " is the fraction of all the rolls");
			System.out.println("12 appears " + k + " number of times and " +k/Rolls+ " is the fraction of all the rolls");
			
		
		


		
		}

	}


