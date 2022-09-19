import javax.swing.JOptionPane;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		boolean i = true;
		while (i==true) {
			System.out.println("I'm inside the loop");
			//This is an infinite loop  */
		
		String userInput="";
		while(!userInput.equalsIgnoreCase("quit")) {
			userInput=JOptionPane.showInputDialog("Please enter a word. Enter 'quit' to exit: ");
			System.out.println(userInput);
		}
		
		
		} 

	}

