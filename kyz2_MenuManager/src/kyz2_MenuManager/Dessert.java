package kyz2_MenuManager;

/**
 * Class Dessert
 * This class creates a dessert  
 * @author Kyle Zhang
 *
 */
public class Dessert {

	//define properties
	private String name;
	private String description;
	private int calories;
	/**
	 *Constructor for dessert based on parameters
	 * @param name name of dessert
	 * @param description description of dessert
	 * @param calories calories of dessert
	 */
	//Constructor
	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	//Getters and setters
	/**
	 * Getter for name
	 * @return name of dessert
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of name
	 * @param name Name of dessert
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *Getter of Description
	 * @return Description of dessert
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter for description
	 * @param description of dessert
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for calories
	 * @return calories of dessert
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for calories
	 * @param calories calories of dessert
	 */

	public void setCalories(int calories) {
		this.calories = calories;
	}

}