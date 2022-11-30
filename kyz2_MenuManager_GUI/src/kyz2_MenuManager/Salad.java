package kyz2_MenuManager;

/**
 * Class Salad
 * @author Kyle Zhang
 *11/1/2022
 */
public class Salad extends MenuItem{
	//Properties now inherited from MenuItem
	/*
	private String name;
	private String description;
	private int calories;
	 */

	/**
	 * Method Salad: Constructor for salad based on parameters
	 * @param name String name of salad
	 * @param description String description of salad
	 * @param calories int calories of salad
	 */
	//Constructor
	public Salad(String name, String description, int calories, double price) {
		super(name, description, calories, price);
	}















	//Getters and Setters NOW INHERITED FROM MENUITEM

	/*
	/** 
	 * Method getName: Getter for name 
	 * @return name String name for salad

	public String getName() {
		return name;
	}
	/**
	 * Method setName: Setter for name
	 * @param name String name of salad


	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Method getDescription: Getter for description
	 * @return description String description of salad

	public String getDescription() {
		return description;
	}
	/**
	 * Method setDescription: Setter of description
	 * @param description String description of salad

	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Method getCalories: Getter of calories
	 * @return calories int calories of salad

	public int getCalories() {
		return calories;
	}
	/**
	 * Method setcalories: Setter of calories
	 * @param calories int calories of salad

	public void setCalories(int calories) {
		this.calories = calories;
	}
	 */
}