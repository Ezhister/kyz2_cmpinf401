
public class Lab10 {


	//Main Method
	public static void main(String[] args) {
		int result = sumOfDigits(1234);
		System.out.println(result);

		
		int a[] = {1, 2, 3, 4};
		printArrayElements(a,1);

		int a1[] = {1, 2, 3};
		printCombos(a1, "", 0, 2);
		
		int a2[] = {2, 3, 7, 8, 9};
		printCombos(a2, "", 0, 3);

	}

	//Task 1 Function - Recursive returns sum of digits of an integer
	static int sumOfDigits(int x) {

		//Remove the negative if necessary
		if (x <0 ) {
			x = x * -1;
		}

		int temp=0;


		if (x>=1) {
			temp = x%10 + sumOfDigits(x/10);
		}






		return temp;
	}

	//Task 2 Function - Recursive no loops prints all elements of array of integers
	//one per line
	
	static void printArrayElements(int a[], int index) {
		//Create replica of parameters
				int b[]= a;
				int index2 = index+1;
				
			if (index < a.length) { 
		System.out.println(a[index]); 
		
		printArrayElements(b, index2);
			}
	
	}

	
	//Task 3 Function - Recursive array of ints, find all combos of given length
	//No permutations, out stores each line of output to print
	public static void printCombos(int[]a,String out, int startIndex, int k) {
		//System.out.println(out+" "+ k);
		

		if (k==0) { //print the string)
		
			
		System.out.println("{ " + out + " }");
		return;
		
		}
		
		if(startIndex>a.length-1) return; 
			
		
		
		
		printCombos(a,out+a[startIndex], startIndex+1,k-1);
		printCombos(a,out,startIndex+1,k);
	
		
		
			
			
			}
	
	
}
		
		
		
		
	
	
		
		
		
	
		
	
		
	

	
	
		
		



