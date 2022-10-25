package kyz2_MenuManager;

/**
 * Class Menu
 * This class creates a menu based off previously defined classes
 * @author Kyle Zhang
 *
 */
public class Menu {
	//define property
	private String name;

	//get objects of previously defined classes
	Entree entree;
	Salad salad;
	Side side;
	Dessert dessert;
	/**
	 * Menu with no items on it
	 * @param name Name of this menu
	 */
	//Make methods
	public Menu(String name) {
		this.name=name;
		entree= null;
		side = null;
		salad = null;
		dessert = null;
	}
	/**
	 * Menu for an entree and side
	 * @param name of Menu
	 * @param entree Entree
	 * @param side Side
	 */
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree=entree;
		this.side=side; 
		//Make undefined objects null
		salad = null;
		dessert = null;

	}
	/**
	 * Menu with all items
	 * @param name of Menu
	 * @param entree Entree
	 * @param side Side
	 * @param salad Salad
	 * @param dessert Dessert
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree=entree;
		this.side=side; 
		this.salad=salad;
		this.dessert=dessert; 
	}



	/**
	 * Method to obtain total calories in a menu
	 * @return total calories
	 */
	public int totalCalories() {
		int total=0;
		if(entree!=null) {
			total = total + entree.getCalories();
		}

		if(salad!=null) {
			total = total + salad.getCalories();
		}

		if(side!=null) {
			total = total + side.getCalories();
		}

		if(dessert!=null) {
			total = total + dessert.getCalories();
		}

		return total;	
	}
	/**
	 * Method to create a description for any menu
	 * @return Description
	 */
	//Checking if the item exists before adding to sentence otherwise it's N/A
	public String description() { 
		String sentence= "Entree: ";

		if(entree!=null) {
			sentence = sentence + entree.getDescription();
		}

		if(entree == null) {
			sentence = sentence + "N/A";
		}
		sentence = sentence + "\nSide: ";

		if(side!=null) {
			sentence = sentence + side.getDescription();
		}

		if(side==null) {
			sentence = sentence + "N/A";
		}
		sentence = sentence + "\nSalad: ";

		if(salad!=null) {
			sentence = sentence + salad.getDescription();
		}
		if(salad==null) {
			sentence = sentence + "N/A";
		}
		sentence = sentence + "\nDessert: ";
		if(dessert!=null) {
			sentence = sentence + dessert.getDescription();
		}

		if(dessert==null) {
			sentence = sentence + "N/A";
		}

		return sentence;

	}
	//Getter and setters
	/**
	 * Getter for name of menu
	 * @return name of menu
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for name of menu
	 * @param name of menu
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for Entree
	 * @return entree
	 */
	public Entree getEntree() {
		return entree;
	}
	/**
	 * Setter for Entre
	 * @param entree 
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	/**
	 * Getter for salad
	 * @return salad
	 */
	public Salad getSalad() {
		return salad;
	}
	/**
	 * Setter for salad
	 * @param salad 
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	/**
	 * Getter for side
	 * @return side
	 */
	public Side getSide() {
		return side;
	}
	/**
	 * Setter for side
	 * @param side
	 */
	public void setSide(Side side) {
		this.side = side;
	}
	/**
	 * Getter for dessert
	 * @return dessert
	 */
	public Dessert getDessert() {
		return dessert;
	}
	/**
	 * Setter for dessert
	 * @param dessert
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

}






