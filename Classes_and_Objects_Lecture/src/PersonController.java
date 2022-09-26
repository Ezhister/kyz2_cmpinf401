
public class PersonController {

	public static void main(String[] args) {
		// class that has public static void main is "driver class"
		Person p = new Person();
		//p.ssn = "111-11-1111";
		
		//p.ssn = "111-11-2222";
		System.out.println(p.getSsn());
		
		System.out.println(p.getFirstName());
		p.setFirstName("Bob");
		System.out.println(p.getFirstName());
	}

}
