
public class Strings {
//All you need on strings
	public static void main(String[] args) {
		String temp = "Hello World";
		
		//Getting a character at specified index/position
		System.out.println(temp.charAt(0));
		//0 starts at the first letter in this case H
		//temp.charAt looks at a specific character 
		System.out.println((int)temp.charAt(3));  //Converts letter to number 

		//Getting an index of a character
		System.out.println(temp.indexOf('H'));
		System.out.println(temp.indexOf('x'));
		//the search for x returns -1. meaning it doesn't exist
		
		if(temp.indexOf('o') == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found at position " + temp.indexOf('o'));
			
			//Getting part of a string
			System.out.println(temp.substring(6));
			System.out.println(temp.substring(6,8));
			//substring using only one parameter it says where to start and goes til the end of substring. If you use two parameters, the first number is the start and the second is where you stop/length of substring
		}
		//Replacing characters or substrings
		System.out.println(temp.replace('o','z' ));
		System.out.println(temp.replace("world","universe" )); //remember to use double quotations for phrase
	}

}
