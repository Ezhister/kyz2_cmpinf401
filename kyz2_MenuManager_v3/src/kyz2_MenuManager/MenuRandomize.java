package kyz2_MenuManager;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * @author Kyle Zhang
 *11/1/2022
 */
public class MenuRandomize {



	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();



	/**
	 * Method MenuRandomize
	 * @param entreeFilename a String
	 * @param sideFilename a String
	 * @param saladFilename a String
	 * @param dessertFilename a String
	 */
	public MenuRandomize(String entreeFilename, String sideFilename, String saladFilename, String dessertFilename) {
		//The static in the read___ methods allow any instance of the filemanager to use these methods
		FileManager fm = new FileManager();
		//These are arrays with a bunch of entrees, sides, salads, desserts
		entrees=fm.readEntrees(entreeFilename);
		sides=fm.readSides(sideFilename);
		salads=fm.readSalads(saladFilename);
		desserts=fm.readDesserts(dessertFilename);
	}


	/**
	 * Method RandomMenu
	 * @return Menu an ArrayList of type Menu
	 */

	public Menu randomMenu() {
		String 	random_name="Random Menu";
		Entree	random_entree;
		Side	random_side;
		Salad	random_salad;
		Dessert	random_dessert;
		Random rd = new Random(); 
		int w =rd.nextInt(5); //From 0-5, as 5 is excluded
		int x =rd.nextInt(5); 
		int y =rd.nextInt(5); 
		int z =rd.nextInt(5); 

		//get the random element of array list entree, side, salad, dessert
		random_entree= entrees.get(w);
		random_side= sides.get(x);
		random_salad=salads.get(y);
		random_dessert=desserts.get(z);


		Menu randomMenu_returned = new Menu(random_name,random_entree,random_side,random_salad,random_dessert);


		return randomMenu_returned;
	}


}