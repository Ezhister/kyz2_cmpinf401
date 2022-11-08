import java.lang.*;
public class Circle {

	//Properties (private)
	private double radius = 5.0;
	private String color = "Green";
	
	//Define constructor
	public Circle() {}
	
	public Circle(double radius) {
	this.radius=radius;
	}
	
	public Circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	
	//Getters and Setters
	public double getRadius() {
		
		return radius;
	}
	public void setRadius(double radius) {
		
		this.radius=radius;
	}
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		
		this.color=color;
		
	}

	public double getArea() {
		double area= Math.PI * (radius * radius); 
		
		return area;
	}
	
	
	}

