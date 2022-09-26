
public class TallyCounterDriver {

	public static void main(String[] args) {
		TallyCounter t1 = new TallyCounter();
		TallyCounter t2 = new TallyCounter();
		
		//t.click();         //the t references tally counter
		for(int i =1; i<=50000; i++) {
			t1.click();
			
		}
		
		for(int i=1;i<=50000;i++) {
			t2.click();
		}
		int total = t1.addTwoNumbers(t1.getCount(),t2.getCount());  //returns current/final state of counts for t1 and t2
		
		System.out.println(total);
		
	


	}

}
