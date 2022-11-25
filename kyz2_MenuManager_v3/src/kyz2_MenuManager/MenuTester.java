package kyz2_MenuManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class MenuTester
 * @author Kyle Zhang
 *11/1/2022
 */

//Look in MenuTest for code I used to test 

public class MenuTester {


	public static void main(String[] args){

			//create object of type FileManager
		FileManager fm = new FileManager();
		
		ArrayList<MenuItem> menuItems = FileManager.readItems("data\\dishes.txt");
		
	
		

		
		
		//Following code was used to test in Assignment 2
		/*
		MenuRandomize randomize = new MenuRandomize("data\\entrees.txt",
				"data\\sides.txt","data\\salads.txt","data\\desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
				myMenu.totalCalories());

		*/

	}


}
