
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
	float speed=0f;
	
	void Update()          //event handler
	{
		//if (Input.GetKeyDown.KeyCode.S)         happens in response to an event             this is a code for unity+
	}
	//start is called before the first frame update
	void start() {
		carState =1; //the car is idling
		//speed=gameObject.transform.position.X
		
	}
	
	void accelerate(double inputForce) {
		if (carState !=0) {   //The car needs to be running to accelerate!)
			carState = 2; // the car is accelerating
			//Making things up - car accelerates at twice the input Force
			speed +=0.05f;  //We are adding inputForce * 2 each time you hit the pedal
		}
		//gameObject.transform.position.new Vector2(speed, gameObject.trasnform.position.y); moving along position y
	} 

	
	void slowDown(double inputForce) {
		speed -= -0.05f;
		if(speed<=0) {
			carState = 1; //car state goes back to idling
			speed=0;
			//gameObject.transform.position.new Vector2(speed, gameObject.trasnform.position.y); //slowing down along position y
		}
	}
	
	void turnOff() {
		carState = 0; 
		speed=0;
		//
	}
	}


	
	
