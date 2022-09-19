
public class Loops {
//Teaching how to loop
	public static void main(String[] args) {
		
	
		// Write a loop that goes through a string
		for(int i=1; i<=10; i++) {   //the semicolon separates 
				//System.out.println(i);
	}	
		//backward loop
		for(int i=10; i>=1; i--) {   
			//System.out.println(i);
	}
		//Looping through a string
		String temp= "Hello world";
		for (int i=0; i<temp.length(); i++) {     //remember strings always start at 0. the last character is length of string minus 1. You can also do i<=temp.length()-1
		//System.out.println(temp.charAt(i)); We see that the characters print out one by one
		
		}
		
		for (int i=temp.length()-1;i>=0;i--) {
			System.out.print(temp.charAt(i)); //charAt gets the character at location i
		}
		
	}
	
}
