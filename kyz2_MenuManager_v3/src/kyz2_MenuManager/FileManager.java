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

	
	
	public  ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> MenuItemArray= new ArrayList<MenuItem>(); 
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			//Goes to end of file
			while ((line = br.readLine()) != null) {

				//Split each line into string array
				String[] stringArray = line.split("@@");

				//Stores values in object properties (MenuItem) I know only 3 columns

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







}

