
public class ArrayExamples {

	public static void main(String[] args) {
		/* 
		 * 10 chars
		 * 5 integers
		 * 10 booleans
		 * 25 floats
		 */
		char[] charArray= new char[5];
		
		//bad way to populate, good way to updates values of an array
		charArray[0] = 'a';
		charArray[1]='b';
		charArray[2]='c';
		charArray[3]='d';
		charArray[4]='e';
		
		
		//System.out.println(charArray[3]);   //prints out d
		String s = "Hellow world";
		System.out.println("String length is a method: " +s.length());  //in string class length is a method
		
	//	System.out.println("Array lenngth is a property: " + charArray.length); //in an array length is a property, so length() is wrong here
		
		for(int i=0; i<charArray.length; i++ ) {
			System.out.println("Element in position " + i + " = " + charArray[i]);
			
			int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};   //better way to populate arrays 
			//Remember last element of an array is length - 1 .
			for (int j =0; i<intArray.length; j++) {   //scope of i is in the loop, so we can reuse it here
				System.out.println("Element in position " + i + " = " + intArray[i]);
			}
		}
		
	}
		
}
