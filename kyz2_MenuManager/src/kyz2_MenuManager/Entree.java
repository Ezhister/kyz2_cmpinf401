package kyz2_MenuManager;

/**
 * Class Entree
 * @author Kyle Zhang
 * This class creates Entree
 */


public class Entree {
	//define properties
	private String name;
	private String description;
	private int calories;

	//Constructor
	/**
	 * Constructor for Entree based on parameters
	 * @param name Name of Entree
	 * @param description Description of Entree
	 * @param calories Number of calories in Entree
	 */
	public Entree(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;



	}
	/**
	 * Getter for name 
	 * @return Name of Entree
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for name
	 * @param name Name of Entree
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for description
	 * @return description of Entree
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter for description
	 * @param description Description of Entree
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for calories
	 * @return calories of entree
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for calories
	 * @param calories calories of entree
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
