package kyz2_MenuManager;

import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileManager {

	public static void main(String[] args) {
	
//ArrayList<Entree> entreeArray=readEntrees();
	
	
	} 
	//Method to read file for an entree
	public static ArrayList<Entree> readEntrees(String fileName) {
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
		        	
		        	Entree e = new Entree(stringArray[0],stringArray[1],Integer.parseInt(stringArray[0]));
		       
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
		 
		 System.out.println(entreeArray);

		
		
		
		return entreeArray;
	}
	
	
	
	
	//Method to read file for a side
		public static ArrayList<Side> readSides(String fileName) {
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
			        	
			        	Side e = new Side(stringArray[0],stringArray[1],Integer.parseInt(stringArray[0]));
			       
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
			 
			 System.out.println(sideArray);

			
			
			
			return sideArray;

		}
	
		//Method to read file for a Salad
		public static ArrayList<Salad> readSalads(String fileName) {
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
			        	
			        	Salad e = new Salad(stringArray[0],stringArray[1],Integer.parseInt(stringArray[0]));
			       
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
			 
			 System.out.println(saladArray);

			
			
			
			return saladArray;
		}	
		
		//Method to read file for a Dessert
		public static ArrayList<Dessert> readDesserts(String fileName) {
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
			        	
			        	Dessert e = new Dessert(stringArray[0],stringArray[1],Integer.parseInt(stringArray[0]));
			       
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
			 
			 System.out.println(dessertArray);

			
			
			
			return dessertArray;
		}
		
		public class MenuRandomize {
			
		
			
			private ArrayList<Entree> entrees = new ArrayList<Entree>();
			private ArrayList<Side> sides = new ArrayList<Side>();
			private ArrayList<Salad> salads = new ArrayList<Salad>();
			private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
			private String projectPath;
			
			
			public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
			entrees=readEntrees(entreeFile);
			sides=readSides(sideFile);
			salads=readSalads(saladFile);
			desserts=readDesserts(dessertFile);
			
			//Where do I put this??
			projectPath=getCurrentWorkingDirectory();
				
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

		public class MenuTester{
			public static void main(String[] args){
				
				//error when doing this
				projectPath=getCurrentWorkingDirectory();
				
				MenuRandomize randomize = new MenuRandomize("data\\entrees.txt",
					"data\\sides.txt","data\\salads.txt","data\\desserts.txt");
				Menu myMenu = randomize.randomMenu();
				System.out.println(myMenu.description()+"\nTotal calories"+
									myMenu.totalCalories());
			}
		}

		
		private String getCurrentWorkingDirectory() { //to get path
			String userDirectory = System.getProperty("user.dir");
	        return userDirectory;
		}
	}

