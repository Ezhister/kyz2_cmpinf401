package kyz2_MenuManager;

/**
 * Class that creates Salad
 * @author Kyle Zhang
 *
 */
public class Salad {
	//define properties
	private String name;
	private String description;
	private int calories;

	/**
	 * Constructor for salad based on parameters
	 * @param name name of salad
	 * @param description description of salad
	 * @param calories calories of salad
	 */
	//Constructor
	public Salad(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	//Getters and setters
	/** 
	 * Getter for name 
	 * @return name for salad
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for name
	 * @param name Name of salad
	 */

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for description
	 * @return description of salad
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter of description
	 * @param description description of salad
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter of calories
	 * @return Calories of salad
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter of calories
	 * @param calories of salad
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}