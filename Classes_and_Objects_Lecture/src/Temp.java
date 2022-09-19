
public class Temp {

	public static void main(String[] args) {
		//These are methods!!
		/*String temp= "Hello";
		System.out.println(temp.length());
		System.out.println(temp.indexOf('H'));
		System.out.println(temp.charAt(2));
		*/
		
		//Use new for custom classes you created
		Car c1= new Car();
		c1.color="blue";
		c1.make="Ford";
		c1.model="Focus";
		c1.bodyType ="sedan";
		c1.year=2022;
		
		Car c2=new Car();
		c2.color="green";
		c2.make="Toyota";
		c2.model="Land Cruzer";
		c2.bodyType="SUV";
		c2.year=2019;
		
		//Print out colors
		System.out.println(c1.color);
		System.out.println(c2.color);
	c2.color="red"; //changing state of the car
	
	c1.start();
	System.out.println(c1.carState); //Notice how the .start action was created in car.java
	System.out.println(c2.carState);
	
	c1.accelerate(10);
	System.out.println(c1.speed);
	c2.accelerate(10);
	System.out.println(c2.speed);
	
	c1.slowDown(10);
	System.out.println(c1.speed);
	c2.slowDown(10);
	System.out.println(c2.speed);

	}

}
