package kyz2_MenuManager;

public class MenuItem {  //Superclass for entree, side, salad, dessert (all 4 extend MenuItem)
	//inherit following properties
	private String name;
	private String description;
	private int calories;
	//new property
	private double price; 

	//Set up Constructor to also inherit

	public MenuItem(String name, String desc, int cal, double price) {
		this.name =name;
		this.description = desc;
		this.calories  = cal;
		this.price = price;
	}





	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
