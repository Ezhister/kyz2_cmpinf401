
public class Scope extends Driver {
/** FIX LATERRRRRRRRRRRRRR
 * Three levels of scope:
 * 1.Global
 * 2.Local
 * 3. Code block level (loop or if statement)
 */
	
	
	// Global variable, accessible from anywhere in the class
	private int global; //declared outside of any constructor or method, can be accessed anywhere in the class
	
	public Scope() {
		this.global = 0;
	}
	public void changeGlobal() {
		this.global  ++;
		
	}
	public void getGlobal() {
		System.out.println(this.global);
	}
	//some Value and test variables only available to LocalVarExample method
	public void LocalVarExample(int someValue) {    //A method
		String test= "Hello World";  //local var, only available to the function
	}
	public void breakLocalVarExample() {
	//	System.out.println(test); //Doesn't work because it doesn't know about the test var since it's local
	//System.out.println(someValue); can't find someValue it's local
	}
		public void loopScope1() {
			for(int i=0;i<10;i++) {
				System.out.println(i); 
			}
			
		}
		//	System.out.println(i);  //loop level scope, can't use i from for loop
			public void loopScope2() {
				for(int i=0;i<10;i++) {
					double x = 10;
							System.out.println(x *i);
				}
				//System.out.println(x); //x can't be accessed from outside loop
			}
				
				
		
		public void ifScope() {
			boolean i = true;
			if(i) {
				boolean k = false;
			
			}
		// 	System.out.println(k) even in if statement can't be accessed
		}
}

