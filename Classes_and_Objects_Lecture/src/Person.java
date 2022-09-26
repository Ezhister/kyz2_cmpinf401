
public class Person {
	private String ssn = "111-11-1111";  //private makes it not usable in personController. Their values can't be modified elsewhere
	private String dob="1977-04-11: ";
	private String firstName = "Dmitry";
	private String lastName = "Babichenko";
	
	//Click on source, there is an option to generate getters and setters!!!!
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {  //getter
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public String getDob() {
		return dob;
	}
	
	/*public String getSnn() {
		return ssn;
	}
	public String getDob() {
		return dob;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String val) {
		firstName=val;	//overrides the value
	}
	*/
	

}
