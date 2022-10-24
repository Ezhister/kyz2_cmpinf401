
public class Driver_Generics {

	public static void main(String[] args) {
		Test<String> t1 = new Test<String>();
		
		Test<Date> t2 = new Test<Date>();

		Test<Car> t3 = new Test<Car>();
		t1.obj = "Hello world";
		
		t2.obj = new Date();
		
		t3.obj = new Car();
	}

}
