package kyz2_MenuManager;

/**
 *This class creates Side
 * @author Kyle Zhang
 *
 */
public class Side {
	//define properties

	private String name;
	private String description;
	private int calories;

	/**
	 * This constructor creates a new side based on parameters
	 * @param name name of side
	 * @param description description of side
	 * @param calories calories of side
	 */
	//Constructor
	public Side(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	//Getters and setters
	/**
	 * Getter for name
	 * @return Name of side
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for name
	 * @param name of side
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for description
	 * @return description of side
	 */
	public String getDescription() {
		return description;
	}
	/** 
	 * Setter for description
	 * @param description for side
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for calories
	 * @return calories of side
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for calories
	 * @param calories of side
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}


}