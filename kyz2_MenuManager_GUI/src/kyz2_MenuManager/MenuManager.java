package kyz2_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	//ArrayLists
private ArrayList<Entree> entrees = new ArrayList<Entree>();
private ArrayList<Side> sides = new ArrayList<Side>();
private ArrayList<Salad> salads = new ArrayList<Salad>();
private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

//Constructor
public MenuManager(String dishesFile) {
	ArrayList<MenuItem> dishes = FileManager.readItems(dishesFile);
	//System.out.println(dishes);
//separate arraylist containing menuItem objects into 4 arrayList
	for(MenuItem item : dishes) {
		
		System.out.println(item);
		if(item instanceof Entree) {
			entrees.add((Entree) item);
		}
		
		if(item instanceof Side) {
			sides.add((Side) item);
		}
		
		if(item instanceof Salad) {
			salads.add((Salad) item);
		}
		
		if(item instanceof Dessert) {
			desserts.add((Dessert) item);
		}
	}
		
	}
public Menu randomMenu(String name) {
	String 	random_name= name;
	Entree	random_entree;
	Side	random_side;
	Salad	random_salad;
	Dessert	random_dessert;
	Random rd = new Random(); 
	//Each have different number of elements
int w =rd.nextInt(entrees.size()); //get an int up to size of entrees
int x =rd.nextInt(sides.size()); 
int y =rd.nextInt(salads.size()); 
int z =rd.nextInt(desserts.size()); 

//get the random element of array list entree, side, salad, dessert
random_entree= entrees.get(w);
random_side= sides.get(x);
random_salad=salads.get(y);
random_dessert=desserts.get(z);


Menu randomMenu_returned = new Menu(random_name,random_entree,random_side,random_salad,random_dessert);
//Checking code
System.out.println(randomMenu_returned.getName() + " " + randomMenu_returned.getEntree() + " "+ randomMenu_returned.getSalad() + " "+ randomMenu_returned.getSide() + " "+ randomMenu_returned.getDessert());
	
	return randomMenu_returned;
}

 
public Menu minCaloriesMenu(String name) {  
	
	Entree entree_low= null;
	Side side_low =null;
	Salad salad_low = null;
	Dessert dessert_low = null;
	
	//Set reference calories super high so they get replaced in the loops
int entree_cal = 10000;
int side_cal = 10000;
int salad_cal = 10000;
int dessert_cal = 10000;

//entrees, sides, salads, and desserts are the arraylists 

for(int i=0; i<entrees.size(); i++) {
	

	if(entrees.get(i).getCalories()<entree_cal) {
		entree_cal = entrees.get(i).getCalories();
		entree_low = entrees.get(i);
		System.out.println(entree_low);
	}
	
	}

for(int i1=0; i1<sides.size(); i1++) {	
	if(sides.get(i1).getCalories()<side_cal) {
		side_cal = sides.get(i1).getCalories();
		side_low = sides.get(i1); 
		
	}
}


for(int i1=0; i1<salads.size(); i1++) {
	if(salads.get(i1).getCalories()<salad_cal) {
		salad_cal = salads.get(i1).getCalories();
		salad_low = salads.get(i1);
	}	
}

for(int i=0; i<desserts.size(); i++) {
	if(desserts.get(i).getCalories()<dessert_cal) {
		dessert_cal = desserts.get(i).getCalories();
		dessert_low = desserts.get(i);
	}
	
}

	
	
			
	Menu menuLow= new Menu(name, entree_low, side_low, salad_low, dessert_low);
	
	//Check 
	System.out.println(menuLow.getName() + " " + menuLow.getEntree() + " "+ menuLow.getSalad() + " "+ menuLow.getSide() + " "+ menuLow.getDessert());
		return menuLow;
		 
		
	}

public Menu maxCaloriesMenu(String name) {  
	
Entree entree_high= null;
Side side_high=null;
Salad salad_high=null;
Dessert dessert_high=null;

int entree_cal = 0;
int side_cal = 0;
int salad_cal = 0;
int dessert_cal = 0;

//entrees, sides, salads, and desserts are the arraylists 

for(int i=0; i<entrees.size(); i++) {
	

	if(entrees.get(i).getCalories()>entree_cal) {
		entree_cal = entrees.get(i).getCalories();
		entree_high = entrees.get(i);
	}
	
	}

for(int i1=0; i1<sides.size(); i1++) {	
	if(sides.get(i1).getCalories()>side_cal) {
		side_cal = sides.get(i1).getCalories();
		side_high = sides.get(i1);
	}
}


for(int i1=0; i1<salads.size(); i1++) {
	if(salads.get(i1).getCalories()>salad_cal) {
		salad_cal = salads.get(i1).getCalories();
		salad_high = salads.get(i1);
	}	
}

for(int i=0; i<desserts.size(); i++) {
	if(desserts.get(i).getCalories()>dessert_cal) {
		dessert_cal = desserts.get(i).getCalories();
		dessert_high = desserts.get(i);
	}
	
}

	
	
			
	Menu menuLow= new Menu(name, entree_high, side_high, salad_high, dessert_high);
	//I kept the menu name the same so I could copy paste the test code below
System.out.println(menuLow.getName() + " " + menuLow.getEntree() + " "+ menuLow.getSalad() + " "+ menuLow.getSide() + " "+ menuLow.getDessert());
	return menuLow;
	 
	
}
public ArrayList<Entree> getEntrees() {
return entrees;
}
public void setEntrees(ArrayList<Entree> entrees) {
this.entrees = entrees;
}
public ArrayList<Side> getSides() {
return sides;
}
public void setSides(ArrayList<Side> sides) {
this.sides = sides;
}
public ArrayList<Salad> getSalads() {
return salads;
}
public void setSalads(ArrayList<Salad> salads) {
this.salads = salads;
}
public ArrayList<Dessert> getDesserts() {
return desserts;
}
public void setDesserts(ArrayList<Dessert> desserts) {
this.desserts = desserts;
}




}
