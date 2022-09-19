import javax.swing.JOptionPane;
//Understanding the letter to number ascii code thing
//Writing a loop 
//LOOK OVER PROFESSOR'S CODE AND UNDERSTAND WHAT IS GOING ON

public class Palindrome {

	//What is a palindrome? = word or phrase that reads the same backwards and forwards
	//Should ignore capitalization
	//Ignore spaces, punctuation
	//Ignore everything that is not a letter
	
	/*
	 * 1.user provides input
	 * Convert everything to lower case
	 * 3.Remove all non-letter characters
	 * 4.Reverse the word
	 * 5.Compare the two strings
	 */
	public static void main(String[] args) {
		//1. User provides input
		String phrase=JOptionPane.showInputDialog("Please enter a word or a phrase: ");
		System.out.println("original input: " + phrase);
		
		//2. Look up how to convert string to lowercase and use it
		phrase=phrase.toLowerCase();
		System.out.println(phrase);
		
		// 3. Remove all non-letter characters 
		/*a. Iterate through all characters in the input string
		 * b.If a character is a lower case letter, keep it, otherwise ignore it
		 */
		
		//Example of finding if a letter is a letter or not
			int lowerBound = (int)'a';
			int upperBound= (int) 'z';
			String cleanPhrase ="";
			//int asciiletter= (int) letter; //(int) ___ turns your letter into a number using ascii code
			
			for (int i=0; i<phrase.length(); i++) {
				char letter = phrase.charAt(i); 
				int asciiletter = (int) letter; //converts to asscii code
				
				if(asciiletter>= lowerBound && asciiletter<=upperBound) {
					cleanPhrase= cleanPhrase + letter;
				
			}
				System.out.println("removed non-letter chars: " + cleanPhrase);
				
				//4. Reverse the phrase
				String reversedPhrase ="";
				
			System.out.println("Reversed String: ");
			for (int i1=cleanPhrase.length()-1; i1>=0; i1--) {
				//System.out.print(cleanPhrase.charAt(i));
				//reversedPhrase= reversedPhrase + cleanPhrase.charAt(i1);
				reversedPhrase += cleanPhrase.charAt(i1);
			
				System.out.println("Reversed string: " + reversedPhrase);
				
			}
			//5. compare the two strings
			if(cleanPhrase.equals(reversedPhrase)) {
				System.out.println(phrase + " is a palindrome");
				
			}
			else {
				System.out.println(phrase + " is NOT a palindrome");
			}
	}

}
	
}
