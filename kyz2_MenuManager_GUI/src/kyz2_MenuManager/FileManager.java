package kyz2_MenuManager;

import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Class FileManager
 * @author Kyle Zhang
 *11/1/2022
 */
public class FileManager {



	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> MenuItemArray= new ArrayList<MenuItem>(); 
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			//Goes to end of file
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				//Split each line into string array
				String[] stringArray = line.split("@@");

				//Create object of either entree, side, salad, dessert There are 5 columns, name of dish, type, desc, cal, price
				//Then store object in array MenuItem
				if(stringArray[1].equalsIgnoreCase("entree")) {
					//System.out.println("HERE"); was used to test
					Entree e = new Entree(stringArray[0],stringArray[2],Integer.parseInt(stringArray[3]),Double.parseDouble(stringArray[4]));
					//add to array
					MenuItemArray.add(e);
				}

				else if(stringArray[1].equalsIgnoreCase("side")) {
					Side e = new Side(stringArray[0],stringArray[2],Integer.parseInt(stringArray[3]),Double.parseDouble(stringArray[4]));

					//add to array
					MenuItemArray.add(e);
				}

				else if(stringArray[1].equalsIgnoreCase("salad")) {
					Salad e = new Salad(stringArray[0],stringArray[2],Integer.parseInt(stringArray[3]),Double.parseDouble(stringArray[4]));

					//add to array
					MenuItemArray.add(e);
				}
				else if(stringArray[1].equalsIgnoreCase("dessert")) {
					Dessert e = new Dessert(stringArray[0],stringArray[2],Integer.parseInt(stringArray[3]),Double.parseDouble(stringArray[4]));

					//add to array
					MenuItemArray.add(e);
				}



			}
			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) { 
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// System.out.println(entreeArray);
		//System.out.println(MenuItemArray.size());



		return MenuItemArray;
	}

	//write to file called menu.txt
	public static void writeMenu (String filename, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i=0; i<menus.size(); i++) {
				Menu element = menus.get(i);
				//Each menu has entree, side, salad, dessert
				bw.write("\nThe name of the menu is " + element.getName() + "\nDish 1: " + element.getEntree().getName() + " Description: " + element.getEntree().getDescription()
						+ " Calories: " + element.getEntree().getCalories() + " Price: " + element.getEntree().getPrice());
				bw.write("\nDish 2: "+ element.getSide().getName() + " Description: " + element.getSide().getDescription()
						+ " Calories: " + element.getSide().getCalories() + " Price: " + element.getSide().getPrice());
				bw.write("\nDish 3: "+ element.getSalad().getName() + " Description: " + element.getSalad().getDescription()
						+ " Calories: " + element.getSalad().getCalories() + " Price: " + element.getSalad().getPrice());		
				bw.write("\nDish 4: "+ element.getDessert().getName() + " Description: " + element.getDessert().getDescription()
						+ " Calories: " + element.getDessert().getCalories() + " Price: " + element.getDessert().getPrice());		

				//total calories
				int calTotal = element.getEntree().getCalories() + element.getSide().getCalories() +element.getSalad().getCalories() + element.getDessert().getCalories();
				bw.write("\n Total Calories: " + calTotal);
				
				double price = element.getEntree().getPrice() + element.getSide().getPrice() +element.getSalad().getPrice() + element.getDessert().getPrice();
				//total price
				bw.write("\n Total Price: " + price + "0");

			}



			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}



	}












	/*  Below are all of the previous methods to read files

	/**
	 * Method readEntrees
	 * @param fileName a String 
	 * @return entreeArray an ArrayList of type Entree


	//Method to read file for an entree
	public  ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entreeArray = new ArrayList<Entree>(); 
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			//Goes to end of file
			while ((line = br.readLine()) != null) {

				//Split each line into string array
				String[] stringArray = line.split("@@");

				//Stores values in object properties (entree) I know only 3 columns

				Entree e = new Entree(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]));

				//add to array
				entreeArray.add(e);



			}
			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) { 
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// System.out.println(entreeArray);




		return entreeArray;
	}



	/**
	 * Method readSides
	 * @param fileName a String 
	 * @return entreeArray an ArrayList of type Side


	//Method to read file for a side
	public  ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sideArray = new ArrayList<Side>(); 
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			//Goes to end of file
			while ((line = br.readLine()) != null) {

				//Split each line into string array
				String[] stringArray = line.split("@@");

				//Stores values in object properties (Side) I know only 3 columns

				Side e = new Side(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]));

				//add to array
				sideArray.add(e);



			}
			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) { 
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		//	 System.out.println(sideArray);






		return sideArray;

	}

	/**
	 * Method readSalads
	 * @param fileName a String 
	 * @return entreeArray an ArrayList of type Salad


	//Method to read file for a Salad
	public  ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> saladArray = new ArrayList<Salad>(); 
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			//Goes to end of file
			while ((line = br.readLine()) != null) {

				//Split each line into string array
				String[] stringArray = line.split("@@");

				//Stores values in object properties (Salad) I know only 3 columns

				Salad e = new Salad(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]));

				//add to array
				saladArray.add(e);


			}
			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) { 
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// System.out.println(saladArray);




		return saladArray;
	}	


	//Method to read file for a Dessert
	/**
	 * Method readDesserts
	 * @param fileName a String 
	 * @return entreeArray an ArrayList of type Dessert

	public  ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> dessertArray= new ArrayList<Dessert>(); 
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			//Goes to end of file
			while ((line = br.readLine()) != null) {

				//Split each line into string array
				String[] stringArray = line.split("@@");

				//Stores values in object properties (entree) I know only 3 columns

				Dessert e = new Dessert(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]));

				//add to array
				dessertArray.add(e);



			}
			br.close();
			fr.close();

		} catch (FileNotFoundException fnfe) { 
			fnfe.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		//	 System.out.println(dessertArray);




		return dessertArray;
	 */




}









