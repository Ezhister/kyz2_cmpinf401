
public class Test {

	public static void main(String[] args) {
		Animal a= new Wolf("Big Bad Wolf");  //Or you could do Wolf w, you can't instantiate animal as a concrete object, but you can instantiate anything that implements it
		
		System.out.println(a instanceof Wolf); //to figure out what class a is
		
	}
}
