package kyz2_MenuManager;

/**
 * Class Side
 * @author Kyle Zhang
 * 11/1/2022
 */
public class Side extends MenuItem{
	//Properties now inherited from MenuItem
	/*
	private String name;
	private String description;
	private int calories;
	 */

	/**
	 * Method Side: This constructor creates a new side based on parameters
	 * @param name String name of side
	 * @param description String description of side
	 * @param calories int calories of side
	 */
	//Constructor
	public Side (String name, String description, int calories, double price) {
		super(name, description, calories, price);
	}





















	//Getters and Setters NOW INHERITED FROM MENUITEM

	/*
	/**
	 * Method getName: Getter for name
	 * @return name String name of side

	public String getName() {
		return name;
	}
	/**
	 * Method setName: Setter for name
	 * @param name String name of side

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Method getDescription: Getter for description
	 * @return description String description of side

	public String getDescription() {
		return description;
	}
	/** 
	 * Method setDescription: Setter for description
	 * @param description String description for side

	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Method getCalories: Getter for calories
	 * @return calories int calories of side

	public int getCalories() {
		return calories;
	}
	/**
	 * Method setCalories: Setter for calories
	 * @param calories int calories of side

	public void setCalories(int calories) {
		this.calories = calories;
	}
	 */

}