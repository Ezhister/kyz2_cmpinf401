
public class Driver {

	public static void main(String[] args) {
		ValueOrReference x = new ValueOrReference();

	//	x.byValue(10);

		//x.byReference(new Node("Hello")); //Whenever you pass an object, you pass a reference to the object
		
		Node n = new Node ("Hello world");
		System.out.println(n);
		Node n1=n;
		System.out.println(n1);  //n1 and n2 reference same memory location
		Node n2= n;
		System.out.println(n2);
	}

}
 