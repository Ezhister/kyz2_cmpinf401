package kyz2_MenuManager;

import java.util.ArrayList;

//THIS CLASS IS FROM ASSIGNMENT 1, IT DOES NOT MATTER TO ASSIGNMENT 3


/**
 * Class MenuTest
 * @author Kyle Zhang
 * 11/1/2022
 */

//CODE USED TO TEST MY CLASSES
public class MenuTest {

	public static void main(String[] args) {
		//Define entrees, sides, salads, and desserts 

		//THE ERROR IS DUE TO HAVING A NEW PARAMETER PRICE
		/*
	Entree Steak= new Entree("Deep-Fried Steak","A delicious 1/2 pound of steak deep fried and made fresh", 500);
	Entree Chicken= new Entree("Teriyaki Chicken", "A Chinese specialty, we make our chicken with teriyaki sauce and cut it in to small pieces", 500);
	Side Rice= new Side("White Rice","A bowl of white rice served steaming hot", 200);
	Salad Caesar = new Salad("Caesar Salad", "Salad served witih caesar salad dressing", 200);
	Salad Ranch = new Salad("Ranch Salad", "Salad served with ranch dressing", 200);
	Dessert Ice_Cream = new Dessert("Ice Cream", "Ice cream, you choose Vanilla or Chocolate", 400);

	//Make 3 menus to test all menus
	Menu menu_0 = new Menu("Menu_0");
	Menu menu_1 = new Menu("Menu_1",Steak, Rice);
	Menu menu_2 = new Menu("Menu 2", Chicken, Rice, Caesar, Ice_Cream);

	//Get total number of calories
	int calories_0=menu_0.totalCalories();
	int calories_1 = menu_1.totalCalories();
	int calories_2=menu_2.totalCalories();
	//Print out all menus
	String Sentence_0=menu_0.description();
	String Sentence_1=menu_1.description();
	String Sentence_2=menu_2.description();
	//System.out.println(Sentence_1);
	System.out.println(" "+ menu_0.getName() + "\n" + Sentence_0 + "\nTotal number of calories: " + calories_0);
	System.out.println(" "+ menu_1.getName() + "\n" + Sentence_1 + "\nTotal number of calories: " + calories_1);
	System.out.println(" "+ menu_2.getName() + "\n" + Sentence_2 + "\nTotal number of calories: " + calories_2);
		 */
		//MenuRandomize mr = new MenuRandomize("data\\dishes.txt");

		//Code for testing
		MenuManager mm = new MenuManager("data\\dishes.txt");
		Menu m,n,l;
		//Checking what comes back
		m= mm.minCaloriesMenu("Name");
		n= mm.maxCaloriesMenu("Menu");
		l=mm.randomMenu("Hm");

		ArrayList<Menu> me = new ArrayList<>();
		me.add(l);
		me.add(n);
		me.add(m);

		FileManager.writeMenu("data\\menu.txt", me);

		//I don't need to test readItems because I know it works as it's used in MenuManager



	}

}
