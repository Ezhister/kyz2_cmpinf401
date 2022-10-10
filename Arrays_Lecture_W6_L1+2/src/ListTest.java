import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// Lecture on debugging
			int[] a= new int[10];    //length() for strings, .length is a method for arrays
			for(int i = 0 ; i<a.length;i++) {
				//System.out.println(a[i]);
			}
			double[] b = new double[10];
			for(int i = 0; i <b.length; i++) {
				//System.out.println(b[i]);
			}
			int[] c = {1, 7, 10, 20, 50, 6};
			for (int i =0; i <c.length; i++) {
			//	System.out.println(c[i] + " --> ");
				c[i] = c[i] * 2;
			//	System.out.println(c[i]);
			}
			
			/*
			 * I have an array called "c"
			 * I can write a loop that follows this logic:
			 * For each element in "c", store the value of that element in some variable x
			 */
			for(int x : c)  {  //colon : means "in" so for each element in c 
		//	System.out.println(x);   //Every time loop goes through c, and stores it in x. Read only array
	}

			int[] y = {1, 2, 3, 4, 5};
			System.out.println("Array: " + y.length);
			String s = "Hello World";
			System.out.println("String: " + s.length());
			
			ArrayList<String> als = new ArrayList<String>();
			als.add("Dmitry");
			als.add("Bob");
			System.out.println("ArrayList: " + als.size());  //Size method
}
	
	
}