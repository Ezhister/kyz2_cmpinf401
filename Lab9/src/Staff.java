
public class Staff extends Person{

private String school;
private double pay;

public Staff(String name, String address, double pay) {  //it doesn't say to put school in parameters
	this.pay=pay;
	this.setAddress(address); 
	this.setName(name);
}

public String getSchool() {
	return school;
}

public void setSchool(String school) {
	this.school = school;
}

public double getPay() {
	return pay;
}

public void setPay(double pay) {
	this.pay = pay;
}

public String toString() {
	String sb="";
	sb+="School: ";
	sb+=this.getSchool();
	sb+="\nPay: ";
	sb+=this.getPay();
	sb+="\nName: ";
	sb+=this.getName();
	sb+="\nAddress: ";
	sb+=this.getAddress();
	
	return sb; 
}

}
