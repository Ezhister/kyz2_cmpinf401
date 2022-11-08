
public class Student extends Person{
//No constructor in Person, so no super call
	
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		this.program=program;
		this.year=year;
		this.fee=fee;
		this.setAddress(address);
		this.setName(name);
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString() {
		
		String sb="";
		sb+="Program: ";
		sb+=this.getProgram();
		sb+="\nYear: ";
		sb+=this.getYear();
		sb+="\nName: ";
		sb+=this.getName();
		sb+="\nAddress: ";
		sb+=this.getAddress();
		sb+="\nFee: ";
		sb+=this.getFee();
		
		return sb;
	}
}
