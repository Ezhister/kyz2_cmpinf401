package kyz2_MenuManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MenuTester {

	
		public static void main(String[] args){
			
			
			/*
			MenuRandomize randomize = new MenuRandomize("data\\entrees.txt",
				"data\\sides.txt","data\\salads.txt","data\\desserts.txt");
			Menu myMenu = randomize.randomMenu();
			System.out.println(myMenu.description()+"\nTotal calories"+
								myMenu.totalCalories());
								*/
			
			//checking file reading works
			FileReader fr;
			try {
				fr = new FileReader("data\\entrees.txt");
				BufferedReader br = new BufferedReader(fr);
				String line = br.readLine();
				System.out.println(line);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	


}
