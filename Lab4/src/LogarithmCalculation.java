import javax.swing.JOptionPane;

public class LogarithmCalculation {

	public static void main(String[] args) {
		// Ask user to enter two values in a while loop
		int number_converted;
		int base_converted;
		
		
		do {
		String number;
		String base;
		number = JOptionPane.showInputDialog("Please enter a value above 0 to take the logarithm of: ");
		base = JOptionPane.showInputDialog("Please enter a base above 1 for the logarithm: ");
		
		//Convert to integers
		number_converted=Integer.parseInt(number);
		base_converted=Integer.parseInt(base);
		}while (number_converted<=0 || base_converted<=1);  //you could also break this up into two while loops
		
		
		//Calculate logarithm   divide by base until quotient is less than base. Record number of completed divisions.
		
		int i=0;  //number of divisions tracker
		int logarithm_tracker=number_converted;
		while(logarithm_tracker>=base_converted) {
				logarithm_tracker=logarithm_tracker/base_converted;
				i=i+1;
		}
		System.out.println("The solution to the log of "+number_converted+" with base " +base_converted + " is " + i);
	
		/*To do the last while loop as a for loop 
		 * for int i=0 while the division it's greater than base i++ 
		 * the division would occur in the for loop and the i would track the number of divisions
		 *while and for loops are pretty much interchangeable
		 */
	} 

}
