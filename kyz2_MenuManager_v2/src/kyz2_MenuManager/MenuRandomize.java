package kyz2_MenuManager;
import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {



	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	private String projectPath;


	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		FileManager fm = new FileManager();
		entrees=fm.readEntrees(entreeFile);
		sides=fm.readSides(sideFile);
		salads=fm.readSalads(saladFile);
		desserts=fm.readDesserts(dessertFile);
	}



	public Menu randomMenu() {
		String 	random_name="Random Menu";
		Entree	random_entree;
		Side	random_side;
		Salad	random_salad;
		Dessert	random_dessert;
		Random rd = new Random(); 
		int w =rd.nextInt(2); //From 0-2
		int x =rd.nextInt(2); 
		int y =rd.nextInt(2); 
		int z =rd.nextInt(2); 

		//get the random element of array list entree, side, salad, dessert
		random_entree= entrees.get(w);
		random_side= sides.get(x);
		random_salad=salads.get(y);
		random_dessert=desserts.get(z);


		Menu randomMenu = new Menu(random_name,random_entree,random_side,random_salad,random_dessert);


		return randomMenu;
	}

}