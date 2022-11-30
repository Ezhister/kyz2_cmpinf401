
public class Factorial {

	public static void main(String[] args) {
		
		int result = factorial(5);
		System.out.println(result);
		
	}
	
		static int factorial (int x) {  //make static to be able to call from public void static main
			int temp;
				if(x > 1){  //important to have base case
				temp = x * factorial(x-1);
			}
			else{
				temp = 1;
			}
			return temp;
			}


	}
