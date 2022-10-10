
public class Car {
	//Duplicate of previous car class
	//note we didn't create public static void
	//We will define properties
	//This allows us to create multiple objects
	private String color;
private	String make;
private 	String model;
	private String bodyType;
	private int year;
	
	
//	public Car() {    //Constructor
	//	System.out.println("this class has been instantiated");
	//}
	
	//You can have multiple constructors
	public Car(String make, String model, String bodyType, int year, String color) {
		this.color = "";
		this.make =make; //this references class level variables, without it references local variables
		this.model=model;
		this.bodyType=bodyType; //key word this refers to class itself, the instance of the object
		this.year=year;
		this.carState=0;    //Constructor instantiates these properties
		
	}
	
	int carState= 0; //the car is off
	double speed=0;
	
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
			speed += inputForce * 2;  //We are adding inputForce * 2 each time you hit the pedal
		}
		//gameObject.transform.position.new Vector2(speed, gameObject.trasnform.position.y); moving along position y
	} 

	
	void slowDown(double inputForce) {
		speed -= - inputForce * 2;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
//	public void setMake(String make) {
		//this.make = make;       //Set at start or initialized and not changed 
	
	public String getModel() {
		return model;
	}
//	public void setModel(String model) {
	//	this.model = model;
	
	public String getBodyType() {
		return bodyType;
	}
	//public void setBodyType(String bodyType) {
		//this.bodyType = bodyType;
	
	public int getYear() {
		return year;
	}
	//public void setYear(int year) {   //Can't change the year of the car
	//	this.year = year;
	
	public int getCarState() {
		return carState;
	}
	//public void setCarState(int carState) {
		//this.carState = carState;   //This is an internal state, no outside access so we will make this a method
	
	public double getSpeed() {
		return speed;
	}
	//public void setSpeed(float speed) {
		//this.speed = speed;    //No one should be able to change speed besides car
	}
	


	
	

