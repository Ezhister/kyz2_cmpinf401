package kyz2_MenuManager;

/**
 * Class Menu
 * @author Kyle Zhang
 *11/1/2022
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
	 * Method Menu: Menu with no items on it
	 * @param name String name of this menu
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
	 *Method Menu : Menu for an entree and side
	 * @param name String name of Menu
	 * @param entree entree of type Entree
	 * @param side side of type Side
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
	 *Method Menu: Menu with all items
	 * @param name String name of Menu
	 * @param entree entree of type Entree
	 * @param side side of type Side
	 * @param salad salad of type Salad
	 * @param dessert dessert of type Dessert
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree=entree;
		this.side=side; 
		this.salad=salad;
		this.dessert=dessert; 
	}



	/**
	 * Method totalCalories: Method to obtain total calories in a menu
	 * @return total int calories total
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
	 * Method description: to create a description for any menu
	 * @return sentence String description
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
	 * Method getName: Getter for name of menu
	 * @return name String name of menu
	 */
	public String getName() {
		return name;
	}
	/**
	 * Method setName: Setter for name of menu
	 * @param name String name of menu
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Method getEntree: Getter for Entree
	 * @return entree 
	 */
	public Entree getEntree() {
		return entree;
	}
	/**
	 * Method setEntree: Setter for Entree
	 * @param entree 
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	/**
	 * Method getSalad: Getter for salad
	 * @return salad
	 */
	public Salad getSalad() {
		return salad;
	}
	/**
	 * Method setSalad: Setter for salad
	 * @param salad 
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	/**
	 * Method getSide: Getter for side
	 * @return side
	 */
	public Side getSide() {
		return side;
	}
	/**
	 * Method setSide: Setter for side
	 * @param side
	 */
	public void setSide(Side side) {
		this.side = side;
	}
	/**
	 * Method getDessert: Getter for dessert
	 * @return dessert
	 */
	public Dessert getDessert() {
		return dessert;
	}
	/**
	 * Method setDessert: Setter for dessert
	 * @param dessert
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	@Override
	public String toString() {
		return this.name;
	}
}






