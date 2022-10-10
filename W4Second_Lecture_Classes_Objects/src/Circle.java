
public class Circle extends Driver {
private double radius;
//don't initialize it and override default constructor
public Circle(double radius) {
	//make sure radius not negative or zero
	if(radius>0) {
		this.radius = radius;
	
	}
	else {
		System.out.println("you cannot have a radius value equal to zero or negative");
	}
}

public double getRadius() { //standard getter  study getters and setters again
	return this.radius;
}

public double perimeter() {

	return this.radius * 2 * Math.PI;
	
}
 public double area() {
	 return Math.PI * Math.pow(this.radius,2);
 }
}
