
public class Fib {
	public static void main(String[] args) {
		fibonacciLoop(20); //first 20 elements of fibonacci
		System.out.println(); //go to next line
		System.out.println(fibonacciRecursion(20));
	}
	public static void fibonacciLoop(int number) {
		int element1 = 1;
		int element2 = 1;		
		System.out.print(element1 + ", " + element2);

		for (int i = 3; i <= number; i++) {
			int temp = element1 + element2; // Fibonacci number is sum of previous two Fibonacci number
			element1 = element2;
			element2 = temp;
			System.out.print(", " + temp);
		}
	}

	public static int fibonacciRecursion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int temp =fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2); // tail recursion
		//System.out.println(temp+ " ");
		return temp;
		
	}

}
