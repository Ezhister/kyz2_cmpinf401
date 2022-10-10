package kyz2_MenuManager;

/**
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
	//Make methods
	public Menu(String name) {
		this.name=name;
		entree= null;
		side = null;
		salad = null;
		dessert = null;
	}

	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree=entree;
		this.side=side; 
		//Make undefined objects null
		salad = null;
		dessert = null;

	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree=entree;
		this.side=side; 
		this.salad=salad;
		this.dessert=dessert; 
	}
	

 

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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

}






