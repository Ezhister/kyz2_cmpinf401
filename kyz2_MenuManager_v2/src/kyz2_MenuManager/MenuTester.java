package kyz2_MenuManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class MenuTester
 * @author Kyle Zhang
 *11/1/2022
 */

public class MenuTester {


	public static void main(String[] args){



		MenuRandomize randomize = new MenuRandomize("data\\entrees.txt",
				"data\\sides.txt","data\\salads.txt","data\\desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+
				myMenu.totalCalories());



	}


}
