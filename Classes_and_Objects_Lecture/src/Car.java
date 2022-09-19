
public class Car {
	//note we didn't create public static void
	//We will define properties
	//This allows us to create multiple objects
	String color;
	String make;
	String model;
	String bodyType;
	int year;
	
	int carState= 0; //the car is off
	double speed=0;
	void start() {
		carState =1; //the car is idling
	}
	
	void accelerate(double inputForce) {
		if (carState !=0) {   //The car needs to be running to accelerate!)
			carState = 2; // the car is accelerating
			//Making things up - car accelerates at twice the input Force
			speed +=inputForce * 2;  //We are adding inputForce * 2 each time you hit the pedal
		}
		
	} 

	
	void slowDown(double inputForce) {
		speed -= inputForce * 2;
		if(speed<=0) {
			carState = 1; //car state goes back to idling
			speed=0;
		}
	}
	
	void turnOff() {
		carState = 0; 
		speed=0;
	}
	}


	
	
