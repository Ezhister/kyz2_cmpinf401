
public class Driver {

	
		public static void main(String[] args) {
			//String make, String model, String bodyType, int year
			//Car c = new Car("Ford", "fiesta", "sedan",2022,"blue"); //Constructor in the car.java makes it so you can set the properties in these parantheses
			//Had to generate getters and setters for below without a constructor
			
			//System.out.println(c.getmMake + ", " + c.getModel());
			/*c.setBodyType("Sedan");
			c.setCarState(0);
			c.setColor("blue");
			c.setMake("Ford");
			c.setModel("Fiesta);");
			c.setYear(2022); */
			
			
		/*	Scope s = new Scope();
			s.changeGlobal();
			s.changeGlobal(); //Should ++ 3 times
			s.changeGlobal();
			s.getGlobal(); */
			
	//		s.loopScope2();
		
			
			/* Dice d = new Dice(2);
			d.roll();
			System.out.println(d.getSides()); */
			/*
			Circle c= new Circle(10);
			System.out.println(c.area());
			System.out.println(c.perimeter()); */
			
			
			Dice d1 = new Dice(4);
			System.out.println(d1.getSides());
			Dice d2 = new Dice();      //If we don't have an input for the constructor it goes to the default constructor
			System.out.println(d2.getSides());
		}
		
}
