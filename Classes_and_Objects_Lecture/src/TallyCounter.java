
public class TallyCounter {
/*
 * What does a tally counter do? (methods)
 * what would its internal state be?
 */
	private int count = 0; //internal state
	
	public void click() {
     count++;               	//void because it updates internal state
	}
	
	public void reset() {
		count =0;
	}
	
	public int getCount() { //to view count
		return count;
	
	}
	
	
public int addTwoNumbers(int n1, int n2) {
	
	int sum = n1+n2;
	
	return sum; //takes value of sum and makes it available to code outside of function
}
}
